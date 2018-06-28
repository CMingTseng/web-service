package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.User;
import com.vietfintex.marketplace.persistence.repo.UserCustomRepo;
import org.apache.commons.collections.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class UserRepoImpl implements UserCustomRepo {
    @PersistenceContext
    private EntityManager em;

//    @Override
//    public User findByUserLogin(String username, String password) {
//        Query query = em.createQuery("SELECT u FROM User u LEFT JOIN UserProfile p WHERE u.userName = :username and u.password = :password AND u.status = 'A'", User.class);
//        query.setParameter("username", username);
//        query.setParameter("password", password);
//        List<User> userList = query.getResultList();
//        return CollectionUtils.isEmpty(userList) ? null : userList.get(0);
//    }
}
