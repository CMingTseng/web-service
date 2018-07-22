package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.ProductOptionM;
import com.vietfintex.marketplace.web.dto.ProductOptionMDTO;

import java.util.List;

public interface ProductOptionMService extends IOperations<ProductOptionM,ProductOptionMDTO> {
    List<ProductOptionMDTO> insertOrUpdate(List<ProductOptionMDTO> productOptionMDTO);
}
