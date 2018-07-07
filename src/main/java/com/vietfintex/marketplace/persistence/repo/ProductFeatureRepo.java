package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.ProductFeature;
import com.vietfintex.marketplace.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductFeatureRepo extends JpaRepository<ProductFeature, Long>, ProductFeatureCustomRepo {

}
