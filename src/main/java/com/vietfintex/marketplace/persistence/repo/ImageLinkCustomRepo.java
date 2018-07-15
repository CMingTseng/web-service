package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Image;

import java.util.List;

public interface ImageLinkCustomRepo {
    List<Image> getImageByObjectId(Long objectId);
}
