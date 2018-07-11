package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.CommissionGroup;
import com.vietfintex.marketplace.persistence.repo.CategoryRepo;
import com.vietfintex.marketplace.persistence.repo.CommissionGroupRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.CategoryDTO;
import com.vietfintex.marketplace.web.dto.CommissionGroupDTO;
import com.vietfintex.marketplace.web.service.CommissionGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionGroupServiceImpl extends AbstractService<CommissionGroup,CommissionGroupDTO> implements
        CommissionGroupService {
    private static final BaseMapper<CommissionGroup, CommissionGroupDTO> mapper =
            new BaseMapper<>(CommissionGroup.class, CommissionGroupDTO.class);
    @Autowired
    private CommissionGroupRepo repo;
    @Override
    public List<CommissionGroupDTO> insertOrUpdate(List<CommissionGroupDTO> commissionGroupDTOList) {
        return getMapper().toDtoBean(repo.saveAll(getMapper().toPersistenceBean(commissionGroupDTOList)));
    }

    @Override
    public List<CommissionGroupDTO> getListByStoreCategoryId(Long storeCategoryId) {
        return getMapper().toDtoBean(repo.getByStoreCategoryIdOrderByLevel(storeCategoryId));
    }

    @Override
    protected PagingAndSortingRepository<CommissionGroup, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<CommissionGroup, CommissionGroupDTO> getMapper() {
        return mapper;
    }
}
