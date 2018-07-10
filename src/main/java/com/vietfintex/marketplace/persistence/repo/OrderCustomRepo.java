package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.web.dto.OrderDTO;

import java.util.List;

public interface OrderCustomRepo {
    List<OrderDTO> search(OrderDTO searchDTO, int startPage, int pageSize);

    Long count(OrderDTO searchDTO);
}
