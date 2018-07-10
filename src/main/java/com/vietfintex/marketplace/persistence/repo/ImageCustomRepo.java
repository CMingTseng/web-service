package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.ImagesLink;
import com.vietfintex.marketplace.web.dto.ImageLinkDTO;

import java.util.List;

public interface ImageCustomRepo {
    List<ImageLinkDTO> getImageLinkByObject(Long objectId,String objectType);
}
