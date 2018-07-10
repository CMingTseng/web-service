package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.CommissionCategory;
import com.vietfintex.marketplace.web.dto.CommissionCategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommissionCategoryRepo extends JpaRepository<CommissionCategory,Long> {
    List<CommissionCategory> findByStoreCategoryId(Long storeCategoryId);
}
