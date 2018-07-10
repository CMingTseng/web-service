package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepo extends JpaRepository<OrderDetail, Long>, OrderDetailCustomRepo {

}
