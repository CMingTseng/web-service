package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.ProductOptionM;
import com.vietfintex.marketplace.persistence.repo.ProductOptionMRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ProductOptionMDTO;
import com.vietfintex.marketplace.web.service.ProductOptionMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductOptionMServiceImpl extends AbstractService<ProductOptionM,ProductOptionMDTO> implements ProductOptionMService {

    BaseMapper<ProductOptionM,ProductOptionMDTO> mapper = new BaseMapper<>(ProductOptionM.class,ProductOptionMDTO.class);
    @Autowired
    ProductOptionMRepo repo;
    @Override
    protected PagingAndSortingRepository<ProductOptionM, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<ProductOptionM, ProductOptionMDTO> getMapper() {
        return mapper;
    }

    @Override
    public List<ProductOptionMDTO> insertOrUpdate(List<ProductOptionMDTO> productOptionMDTO) {
        return getMapper().toDtoBean(repo.saveAll(getMapper().toPersistenceBean(productOptionMDTO)));
    }
}
