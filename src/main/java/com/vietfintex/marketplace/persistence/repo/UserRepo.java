package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Users;
import com.vietfintex.marketplace.web.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<Users, Long>, UserCustomRepo {
    @Query("SELECT u FROM Users u WHERE u.userId = :userId AND u.status = 'A'")
    Users findByUserId(@Param("userId") Long userId);
}
