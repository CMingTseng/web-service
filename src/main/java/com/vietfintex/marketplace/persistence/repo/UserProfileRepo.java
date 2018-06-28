package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepo extends JpaRepository<UserProfile, Long>, UserProfileCustomRepo {
}
