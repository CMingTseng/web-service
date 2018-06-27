package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Users;
import com.vietfintex.marketplace.web.dto.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<Users, Long> {
    @Query("SELECT u.userId, u.userType, u.userLogin, u.url, u.taxExempt, u.phone, u.lastLogin, u.lastname, u.firstname, u.birthday, u.email, u.companyId, u.company, u.apiKey, u.isRoot, u.timestamp, u.passwordChangeTimestamp, u.responsibleEmail FROM Users u WHERE u.userId = :userId AND u.status = 'A'")
    UserDTO findByUserId(@Param("userId") Long userId);
}
