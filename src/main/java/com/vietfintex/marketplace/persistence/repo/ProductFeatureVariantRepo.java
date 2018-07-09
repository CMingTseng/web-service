package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.ProductFeatureVariant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductFeatureVariantRepo extends JpaRepository<ProductFeatureVariant, Long>, ProductFeatureCustomRepo {

}
