package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.web.dto.ProductDTO;

import java.util.List;

public interface ProductCustomRepo {
    List<Product> search(ProductDTO searchDTO, int startPage, int pageSize);

    Long count(ProductDTO searchDTO);
}
