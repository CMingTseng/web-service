package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long>, ProductCustomRepo {

}
