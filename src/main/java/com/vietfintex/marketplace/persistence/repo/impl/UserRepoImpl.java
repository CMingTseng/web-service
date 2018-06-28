package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.repo.UserCustomRepo;
import com.vietfintex.marketplace.web.dto.UserDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class UserRepoImpl implements UserCustomRepo {
    @PersistenceContext
    private EntityManager em;

//    @Override
//    public UserDTO findByUserId(Long userId) {
//        Query query = em.createQuery("SELECT u.userId, u.userType, u.userLogin, u.url, u.taxExempt, u.phone, u.lastLogin, u.lastname, u.firstname, u.birthday, u.email, u.companyId, u.company, u.apiKey, u.isRoot, u.timestamp, u.passwordChangeTimestamp, u.responsibleEmail FROM Users u WHERE u.userId = :userId AND u.status = 'A'", UserDTO.class);
//        query.setParameter("userId", userId);
//        return (UserDTO) query.getSingleResult();
//    }
}
