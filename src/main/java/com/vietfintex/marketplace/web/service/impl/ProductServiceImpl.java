package com.vietfintex.marketplace.web.service.impl;

import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.persistence.repo.ProductRepo;
import com.vietfintex.marketplace.util.BaseMapper;
import com.vietfintex.marketplace.web.dto.ProductDTO;
import com.vietfintex.marketplace.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends AbstractService<Product, ProductDTO> implements ProductService {
    private static final BaseMapper<Product, ProductDTO> mapper = new BaseMapper<>(Product.class, ProductDTO.class);
    @Autowired
    private ProductRepo repo;

    @Override
    protected PagingAndSortingRepository<Product, Long> getDao() {
        return repo;
    }

    @Override
    protected BaseMapper<Product, ProductDTO> getMapper() {
        return mapper;
    }

    @Override
    public List<ProductDTO> search(ProductDTO searchDTO, int startPage, int pageSize) {
        return getMapper().toDtoBean(repo.search(searchDTO, startPage, pageSize));
    }

    @Override
    public Long count(ProductDTO searchDTO) {
        return repo.count(searchDTO);
    }
}
