package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.web.dto.ProductDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductCustomRepo {
    List<Product> search(ProductDTO searchDTO, Pageable pageable);

    Long count(ProductDTO searchDTO);
}
