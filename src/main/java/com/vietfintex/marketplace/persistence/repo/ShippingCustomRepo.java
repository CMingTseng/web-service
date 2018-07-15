package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.web.dto.ShippingDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ShippingCustomRepo {
    List<ShippingDTO> search(ShippingDTO searchDTO, Pageable pageable);

    Long count(ShippingDTO searchDTO);
}
