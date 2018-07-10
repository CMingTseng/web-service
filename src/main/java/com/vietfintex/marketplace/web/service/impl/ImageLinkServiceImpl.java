package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.ImagesLink;
import com.vietfintex.marketplace.persistence.repo.ImageLinkRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ImageLinkDTO;
import com.vietfintex.marketplace.web.service.ImageLinkService;
import com.vietfintex.marketplace.web.service.ImageService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public class ImageLinkServiceImpl extends AbstractService<ImagesLink, ImageLinkDTO> implements ImageLinkService {
    private static final Logger logger = Logger.getLogger(ImageService.class);
    private static final BaseMapper<ImagesLink, ImageLinkDTO> mapper = new BaseMapper<>(ImagesLink.class, ImageLinkDTO.class);
    @Autowired
    private ImageLinkRepo repo;

    @Override
    protected PagingAndSortingRepository<ImagesLink, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<ImagesLink, ImageLinkDTO> getMapper() {
        return mapper;
    }

}
