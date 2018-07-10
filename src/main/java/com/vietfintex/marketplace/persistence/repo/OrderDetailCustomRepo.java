package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.web.dto.OrderDetailDTO;

import java.util.List;

public interface OrderDetailCustomRepo {
    List<OrderDetailDTO> search(OrderDetailDTO searchDTO, int startPage, int pageSize);

    Long count(OrderDetailDTO searchDTO);
}
