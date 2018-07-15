package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.web.dto.ProductOptionDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductOptionCustomRepo {
    List<ProductOptionDTO> search(ProductOptionDTO searchDTO, Pageable pageable);

    Long count(ProductOptionDTO searchDTO);
}
