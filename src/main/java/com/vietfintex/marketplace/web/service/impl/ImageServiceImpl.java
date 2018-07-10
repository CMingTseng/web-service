package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Image;
import com.vietfintex.marketplace.persistence.model.ImagesLink;
import com.vietfintex.marketplace.persistence.repo.ImageLinkRepo;
import com.vietfintex.marketplace.persistence.repo.ImageRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.util.GlobalUtil;
import com.vietfintex.marketplace.web.dto.ImageDTO;
import com.vietfintex.marketplace.web.service.ImageService;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Base64;
import java.util.Date;

@Service
public class ImageServiceImpl extends AbstractService<Image, ImageDTO> implements ImageService {
    private static final Logger logger = Logger.getLogger(ImageService.class);
    private static final BaseMapper<Image, ImageDTO> mapper = new BaseMapper<>(Image.class, ImageDTO.class);
    private static final String IMAGE_URL_RESOURCE = "/resources/images/";
    @Autowired
    ServletContext context;
    @Autowired
    private ImageRepo repo;

    @Autowired
    private ImageLinkRepo imageLinkRepo;

    @Override
    protected PagingAndSortingRepository<Image, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<Image, ImageDTO> getMapper() {
        return mapper;
    }

    @Override
    public String encoder(String imagePath) throws IOException {
        String rootPath = context.getRealPath("") + File.separator + "images";
        File file = new File(rootPath + File.separator + imagePath);
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            String base64Image;
            byte imageData[] = new byte[(int) file.length()];
            imageInFile.read(imageData);
            base64Image = Base64.getEncoder().encodeToString(imageData);
            return base64Image;
        } catch (FileNotFoundException e) {
            logger.error("Image not found" + e);
            throw e;
        } catch (IOException ioe) {
            logger.error("Exception while reading the Image " + ioe);
            throw ioe;
        }
    }
    @Transactional
    @Override
    public Image upload(String base64Image, String filename) throws IOException {
        String rootPath = context.getRealPath("") + File.separator + "images";
        String relativePath = DateFormatUtils.format(new Date(), "yyyy/MM/dd");
        File dir = new File(rootPath + File.separator + relativePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String timeStr = GlobalUtil.getCurrentTime();
        File serverFile = new File(dir.getAbsolutePath() + "/"+timeStr+ "_" + filename);
        if (!serverFile.exists()) {
            serverFile.createNewFile();
        }
//        try (FileOutputStream imageOutFile = new FileOutputStream(ClassLoader.getSystemClassLoader().getResource(filename).getFile())) {
        try (FileOutputStream imageOutFile = new FileOutputStream(serverFile)) {
            // Converting a Base64 String into Image byte array
            byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
            imageOutFile.write(imageByteArray);

            BufferedImage buf = ImageIO.read(new ByteArrayInputStream(imageByteArray));
            Image image = new Image();
            image.setImagePath(IMAGE_URL_RESOURCE + relativePath + "/"+timeStr+ "_" + filename);
            image.setImageX((long) buf.getWidth());
            image.setImageY((long) buf.getHeight());
            return repo.save(image);
        } catch (FileNotFoundException e) {
            logger.error("Image not found" + e.getMessage());
            throw e;
        } catch (IOException ioe) {
            logger.error("Exception while reading the Image " + ioe.getMessage());
            throw ioe;
        }
    }

    @Override
    public boolean deleteImage(String filePath) {
        String rootPath = context.getRealPath("") + File.separator + "images";
        File file = new File(rootPath + File.separator + filePath);
        if (file.exists()){
            file.delete();
            return  true;
        }
        return false;
    }
}
