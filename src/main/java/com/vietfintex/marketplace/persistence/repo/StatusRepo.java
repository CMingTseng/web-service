package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Status;
import com.vietfintex.marketplace.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface StatusRepo extends JpaRepository<Status, Long> {

}
