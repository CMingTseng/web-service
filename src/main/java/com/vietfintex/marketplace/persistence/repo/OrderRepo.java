package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long>, OrderCustomRepo {

}
