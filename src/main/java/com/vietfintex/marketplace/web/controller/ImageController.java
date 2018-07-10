package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.persistence.model.Image;
import com.vietfintex.marketplace.persistence.model.ImagesLink;
import com.vietfintex.marketplace.persistence.repo.ImageLinkRepo;
import com.vietfintex.marketplace.persistence.repo.ImageRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ImageDTO;
import com.vietfintex.marketplace.web.dto.ImageLinkDTO;
import com.vietfintex.marketplace.web.dto.ResponseDTO;
import com.vietfintex.marketplace.web.service.ImageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping(value = "/media")
public class ImageController {
    private static final Logger logger = Logger.getLogger(ImageController.class);
    @Autowired
    ImageService imageService;

    @Autowired
    private ImageLinkRepo imageLinkRepo;

    @Autowired
    private ImageRepo imageRepo;


    private static final BaseMapper<ImagesLink, ImageLinkDTO> mapper = new BaseMapper<>(ImagesLink.class, ImageLinkDTO.class);

    @RequestMapping(value = "/images", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO upload(@RequestBody final ImageDTO imageDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(imageDTO, "not found required imageLinkDTO object");
            Objects.requireNonNull(imageDTO.getObjectId(),"not found required objectID");
            Objects.requireNonNull(imageDTO.getObjectType(),"not found required objectType");
//            logger.info("/POST request with " + imageLinkDTO.getData());
            Image imageUpload = imageService.upload(imageDTO.getData(), imageDTO.getFilename());
            ImagesLink imagesLink = new ImagesLink();
            imagesLink.setObjectId(imageDTO.getObjectId());
            imagesLink.setObjectType(imageDTO.getObjectType());
            imagesLink.setImageId(imageUpload.getImageId());
            ImageLinkDTO imageLinkDTO = mapper.toDtoBean( imageLinkRepo.save(imagesLink));
            imageLinkDTO.setImagePath(imageUpload.getImagePath());
            response.setSuccess(true);
            response.setObjectReturn(imageLinkDTO);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }
    @RequestMapping(value = "/deleteImage", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO deleteImage(@RequestBody final ImageLinkDTO imageLinkDTO){
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(imageLinkDTO.getPairId(),"not found required PairId");
            //Check user request with permission
            ImagesLink imagesLink =
                    imageLinkRepo.findById(imageLinkDTO.getPairId()).orElse(null);
            if (imagesLink != null){
                Image image =  imageRepo.findById(imagesLink.getImageId()).orElse(null);
                imageLinkRepo.deleteById(imageLinkDTO.getPairId());
                if (image != null){
                    imageRepo.delete(image);
                    imageService.deleteImage(image.getImagePath());
                }else{
                    response.setErrorMessage("Không có file ảnh");
                }
                response.setSuccess(true);
                return response;
            }

        }catch (Exception e){
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }
}
