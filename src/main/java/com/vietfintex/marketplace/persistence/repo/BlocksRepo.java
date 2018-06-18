package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Block;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlocksRepo extends JpaRepository<Block, Long> {

}
