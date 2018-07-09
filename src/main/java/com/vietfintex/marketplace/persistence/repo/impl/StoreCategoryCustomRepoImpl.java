package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.StoreCategory;
import com.vietfintex.marketplace.persistence.repo.StoreCategoryCustomRepo;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreCategoryCustomRepoImpl implements StoreCategoryCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public void storeCategoryChange(long storeId, List<Long> categoryIdList) {
        String sql = "INSERT INTO store_category (store_id,category_id,status) values ";
        for (Long categoryId :categoryIdList){
            sql += "("+storeId+","+categoryId+","+"'A'),";
        }
        sql = sql.substring(0, sql.length() - 1);
        Query query = em.createNativeQuery(sql);
        int i = query.executeUpdate();
        return;
    }
}
