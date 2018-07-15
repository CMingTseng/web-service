package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.web.dto.OrderDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderCustomRepo {
    List<OrderDTO> search(OrderDTO searchDTO, Pageable pageable);

    Long count(OrderDTO searchDTO);
}
