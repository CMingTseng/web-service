package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.CommissionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.List;

public interface CommissionGroupRepo extends JpaRepository<CommissionGroup, Long> {
    List<CommissionGroup> getByStoreCategoryId(Long storeCategoryId);
    @Nullable
    CommissionGroup findByGroupIdAndProductIdAndStoreCategoryIdAndLevel(Long groupId, @Nullable Long productId, @Nullable Long storeCategoryId, int level);
}
