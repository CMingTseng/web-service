package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.CommissionGroup;
import com.vietfintex.marketplace.web.dto.CommissionGroupDTO;

import java.util.List;

public interface CommissionGroupService extends IOperations<CommissionGroup,CommissionGroupDTO> {
    List<CommissionGroupDTO> insertOrUpdate(List<CommissionGroupDTO> commissionGroupDTOList);
    List<CommissionGroupDTO> getListByStoreCategoryId(Long storeCategoryId);
}
