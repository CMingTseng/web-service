package com.vietfintex.marketplace.web.service;

import com.querydsl.core.types.Predicate;
import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.web.dto.ProductDTO;
import org.springframework.data.domain.Pageable;


public interface ProductService extends IOperations<Product, ProductDTO> {

    Iterable<ProductDTO> search(Predicate predicate, Pageable pageable);
}
