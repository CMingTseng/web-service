package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.ProductFeature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFeatureRepo extends JpaRepository<ProductFeature, Long>, ProductFeatureCustomRepo {

}
