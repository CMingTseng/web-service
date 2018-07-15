package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.ProductFeature;
import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductFeatureCustomRepo {
    List<ProductFeature> search(ProductFeatureDTO searchDTO, Pageable pageable);

    Long count(ProductFeatureDTO searchDTO);
}
