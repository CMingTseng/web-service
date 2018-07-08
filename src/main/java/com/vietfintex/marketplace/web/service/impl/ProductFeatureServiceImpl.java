package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.ProductFeature;
import com.vietfintex.marketplace.persistence.model.Store;
import com.vietfintex.marketplace.persistence.repo.ProductFeatureRepo;
import com.vietfintex.marketplace.persistence.repo.StoreRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ProductFeatureDTO;
import com.vietfintex.marketplace.web.dto.StoreDTO;
import com.vietfintex.marketplace.web.service.ProductFeatureService;
import com.vietfintex.marketplace.web.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductFeatureServiceImpl extends AbstractService<ProductFeature, ProductFeatureDTO> implements ProductFeatureService {
    private static final BaseMapper<ProductFeature, ProductFeatureDTO> mapper = new BaseMapper<>(ProductFeature.class, ProductFeatureDTO.class);
    @Autowired
    private ProductFeatureRepo repo;

    @Override
    protected PagingAndSortingRepository<ProductFeature, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<ProductFeature, ProductFeatureDTO> getMapper() {
        return mapper;
    }
}
