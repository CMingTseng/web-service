package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.Store;
import com.vietfintex.marketplace.persistence.repo.StoreCustomRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreCustomRepoImpl implements StoreCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Store> getStoreList(Long storeId, Long ownerId, String storeName, String address,Integer page, Double lat, Double lon) {
        String sql ="SELECT s.* FROM store s WHERE 1= 1 ";
        Map<String, Object> param = new HashMap<>();
        if(storeId != null){
            sql += " AND s.store_id = :storeId ";
            param.put("storeId",storeId);
        }
        if(ownerId != null){
            sql += " AND s.owner_id = :ownerId ";
            param.put("ownerId",ownerId);
        }
        if(storeName != null){
            sql += " AND s.store_name LIKE CONCAT('%',:storeName,'%') ";
            param.put("storeName",storeName);
        }
        if(address != null){
            sql += " AND s.address LIKE CONCAT('%',:address,'%')  ";
            param.put("address",address);
        }
        if (lat != null && lon != null){
            sql += " ORDER BY sqrt(pow((:lat - s.latitude),2) + pow((:lon - s.longitude),2))";
            param.put("lat",lat);
            param.put("lon",lon);
        }else{
            sql += " ORDER BY RAND() ";
        }
        Query query = em.createNativeQuery(sql,Store.class);
        if (page!= null)
            query.setFirstResult(page);
        query.setMaxResults(10);
        param.forEach(query::setParameter);
        return query.getResultList();
    }
}
