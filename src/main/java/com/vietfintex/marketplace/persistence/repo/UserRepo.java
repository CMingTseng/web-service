package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends JpaRepository<User, Long>, UserCustomRepo {
    @Query("SELECT u FROM User u WHERE u.userId = :userId AND u.status = 'A'")
    User findByUserId(@Param("userId") Long userId);

    @Query("SELECT u FROM User u WHERE u.userName = :username AND u.password = :password AND u.status = 'A'")
    User findByUsername(@Param("username") String username, @Param("password") String password);

    @Query("SELECT u FROM User u WHERE u.email = :email AND u.password = :password AND u.status = 'A'")
    User findByEmail(@Param("email") String email, @Param("password") String password);

    @Query("SELECT u FROM User u WHERE u.phone = :phone AND u.password = :password AND u.status = 'A'")
    User findByPhone(@Param("phone") String phone, @Param("password") String password);

    @Query("SELECT u FROM User  u WHERE u.userName = :username OR u.email = :email OR u.phone = :phone")
    User checkUsername(@Param("username") String username,@Param("email") String email,
                       @Param("phone") String phone );
}
