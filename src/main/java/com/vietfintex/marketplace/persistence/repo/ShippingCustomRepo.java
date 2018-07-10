package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.web.dto.ShippingDTO;

import java.util.List;

public interface ShippingCustomRepo {
    List<ShippingDTO> search(ShippingDTO searchDTO, int startPage, int pageSize);

    Long count(ShippingDTO searchDTO);
}
