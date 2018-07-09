package com.vietfintex.marketplace.web.controller;

import com.vietfintex.marketplace.persistence.model.Image;
import com.vietfintex.marketplace.web.dto.ImageDTO;
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

    @RequestMapping(value = "/images", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO upload(@RequestBody final ImageDTO imageDTO) {
        ResponseDTO response = new ResponseDTO(false);
        try {
            Objects.requireNonNull(imageDTO, "not found required imageDTO object");
//            logger.info("/POST request with " + imageDTO.getData());
            Image imageUpload = imageService.upload(imageDTO.getData(), imageDTO.getFilename());
            response.setSuccess(true);
            response.setObjectReturn(imageUpload);
        } catch (Exception e) {
            response.setErrorMessage("Có lỗi xảy ra: " + e.getMessage());
        }
        return response;
    }
}
