package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.repo.CategoryCustomRepo;
import com.vietfintex.marketplace.web.dto.CategoryDTO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryCustomRepoImpl implements CategoryCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Category> searchCategory(String searchKey, int page) {
        String sql = "SELECT ca.* FROM category ca WHERE 1 =1 ";
        Map<String, Object> param = new HashMap<>();
        if(searchKey != null && !"".equals(searchKey)){
            sql +=" AND ca.category_name like N'%"+searchKey+"%'";

        }
        Query query = em.createNativeQuery(sql, Category.class);
        query.setMaxResults(10);
        query.setFirstResult(page);
        return query.getResultList();
    }
    @Override
    public List<Category> getListStoreCategory(Long storeCategoryId, Long storeId, Long categoryId,
                                               String keySearch, int page) {
        Map<String, Object> param = new HashMap<>();
        boolean first = false;
        String sql ="SELECT ca.* FROM category ca WHERE ca.category_id IN (SELECT sc.store_category_id FROM store_category sc WHERE 1 = 1 ";
        if(storeCategoryId!=null){
            sql += " AND sc.store_category_id = :storeCategoryId";
            param.put("storeCategoryId",storeCategoryId);
        }
        if(storeId!=null){
            sql += " AND sc.store_id = :storeId";
            param.put("storeId",storeId);
        }
        if(categoryId!=null){
            sql +=  " AND sc.category_id = :categoryId";
            param.put("categoryId",categoryId);
        }
        sql += ")";
        if(keySearch != null && !"".equals(keySearch)){
            sql +=" AND ca.category_name like N'%"+keySearch+"%'";
        }
        Query query = em.createNativeQuery(sql, Category.class);
        query.setMaxResults(10);
        query.setFirstResult(page);
        param.forEach(query::setParameter);
        return query.getResultList();
    }
}
