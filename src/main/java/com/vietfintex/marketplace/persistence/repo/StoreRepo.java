package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store,Long>, StoreCustomRepo {
}
