package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.CommissionGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommissionGroupRepo extends JpaRepository<CommissionGroup, Long> {
    List<CommissionGroup> getByStoreCategoryIdOrderByLevel(Long storeCategoryId);
}
