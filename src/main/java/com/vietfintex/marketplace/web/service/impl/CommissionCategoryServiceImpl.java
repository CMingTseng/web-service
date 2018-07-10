package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.CommissionCategory;
import com.vietfintex.marketplace.persistence.repo.CommissionCategoryRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.CommissionCategoryDTO;
import com.vietfintex.marketplace.web.service.CommissionCategoryService;
import com.vietfintex.marketplace.web.service.impl.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommissionCategoryServiceImpl extends AbstractService<CommissionCategory,CommissionCategoryDTO>
        implements CommissionCategoryService {
    private static final BaseMapper<CommissionCategory, CommissionCategoryDTO> mapper = new BaseMapper<>(CommissionCategory.class,
            CommissionCategoryDTO.class);
    @Autowired
    private CommissionCategoryRepo repo;
    @Override
    public List<CommissionCategoryDTO>  insertOrUpdate(List<CommissionCategoryDTO> commissionCategoryDTOList) {
        return getMapper().toDtoBean(getDao().saveAll(getMapper().toPersistenceBean(commissionCategoryDTOList)));
    }

    @Override
    public List<CommissionCategoryDTO> findByStoreCategoryId(Long storeCategoryId) {
        return getMapper().toDtoBean(repo.findByStoreCategoryId(storeCategoryId));
    }

    @Override
    protected PagingAndSortingRepository<CommissionCategory, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<CommissionCategory, CommissionCategoryDTO> getMapper() {
        return mapper;
    }
}
