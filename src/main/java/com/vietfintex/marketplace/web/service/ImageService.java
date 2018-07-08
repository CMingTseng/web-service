package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.Image;
import com.vietfintex.marketplace.web.dto.ImageDTO;

import java.io.IOException;

public interface ImageService extends IOperations<Image, ImageDTO> {
    String encoder(String imagePath) throws IOException;

    String decoder(String base64Image, String pathFile) throws IOException;
}
