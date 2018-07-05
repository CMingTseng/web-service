package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.StoreCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreCategoryRepo extends JpaRepository<StoreCategory,Long>,StoreCategoryCustomRepo {
}
