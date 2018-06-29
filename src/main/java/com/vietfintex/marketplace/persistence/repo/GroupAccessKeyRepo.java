package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.GroupAccessKey;
import com.vietfintex.marketplace.persistence.model.GroupClub;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupAccessKeyRepo extends JpaRepository<GroupAccessKey, Long> {
}
