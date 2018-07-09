package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.ProductFeature;
import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;

import java.util.List;

public interface ProductFeatureCustomRepo {
    List<ProductFeature> search(ProductFeatureDTO searchDTO, int startPage, int pageSize);

    Long count(ProductFeatureDTO searchDTO);
}
