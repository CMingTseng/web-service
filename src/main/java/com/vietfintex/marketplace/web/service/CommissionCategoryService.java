package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.CommissionCategory;
import com.vietfintex.marketplace.web.dto.CommissionCategoryDTO;

import java.util.List;

public interface CommissionCategoryService extends IOperations<CommissionCategory,CommissionCategoryDTO> {
    List<CommissionCategoryDTO> insertOrUpdate(List<CommissionCategoryDTO> commissionCategoryDTOList);
    List<CommissionCategoryDTO> findByStoreCategoryId(Long storeCategoryId);
}
