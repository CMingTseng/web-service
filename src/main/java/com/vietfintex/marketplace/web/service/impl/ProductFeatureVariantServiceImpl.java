package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.ProductFeatureVariant;
import com.vietfintex.marketplace.persistence.repo.ProductFeatureVariantRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ProductFeatureVariantDTO;
import com.vietfintex.marketplace.web.service.ProductFeatureVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductFeatureVariantServiceImpl extends AbstractService<ProductFeatureVariant, ProductFeatureVariantDTO> implements ProductFeatureVariantService {
    private static final BaseMapper<ProductFeatureVariant, ProductFeatureVariantDTO> mapper = new BaseMapper<>(ProductFeatureVariant.class, ProductFeatureVariantDTO.class);
    @Autowired
    private ProductFeatureVariantRepo repo;

    @Override
    protected PagingAndSortingRepository<ProductFeatureVariant, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<ProductFeatureVariant, ProductFeatureVariantDTO> getMapper() {
        return mapper;
    }

}
