package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.web.dto.ProductOptionDTO;

import java.util.List;

public interface ProductOptionCustomRepo {
    List<ProductOptionDTO> search(ProductOptionDTO searchDTO, int startPage, int pageSize);

    Long count(ProductOptionDTO searchDTO);
}
