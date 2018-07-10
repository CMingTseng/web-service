package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepo extends JpaRepository<Shipping, Long>, ShippingCustomRepo {

}
