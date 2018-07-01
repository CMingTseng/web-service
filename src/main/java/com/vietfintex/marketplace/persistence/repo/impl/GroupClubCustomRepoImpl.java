package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.persistence.repo.GroupClubCustomRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupClubCustomRepoImpl implements GroupClubCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<GroupClub> getListGroupClub(Long groupId, String privacy, String keyword,Long ownerId,Integer page) {
        String sql= "SELECT g.* FROM group_club g WHERE 1= 1 ";
        Map<String, Object> param = new HashMap<>();
        if(groupId!= null){
            sql += " AND g.group_id = :groupId ";
            param.put("groupId",groupId);
        }
        if (privacy != null &&!"".equals(privacy)){
            sql  += " AND g.privacy= :privacy ";
            param.put("privacy",privacy);
        }
        if(keyword != null &&!"".equals(keyword)){
            sql += " AND g.group_name like CONCAT('%',:keyword,'%') ";
            param.put("keyword",keyword);
        }
        if(ownerId != null){
            sql += " AND g.owner_id = :ownerId";
            param.put("ownerId",ownerId);
        }
        Query query = em.createNativeQuery(sql, GroupClub.class);
        query.setMaxResults(10);
        if(page!=null){
            query.setFirstResult(page);
        }
        param.forEach(query::setParameter);

        return query.getResultList();
    }

    @Override
    public List<GroupClub> getListOtherGroupClub(Long groupId, String privacy, String keyword, Long ownerId,Integer page) {
        String sql= "SELECT g.* FROM group_club g WHERE 1= 1 ";
        Map<String, Object> param = new HashMap<>();
        if(groupId!= null){
            sql += " AND g.group_id = :groupId ";
            param.put("groupId",groupId);
        }
        if (privacy != null &&!"".equals(privacy)){
            sql  += " AND g.privacy= :privacy ";
            param.put("privacy",privacy);
        }
        if(keyword != null &&!"".equals(keyword)){
            sql += " AND g.group_name like CONCAT('%',:keyword,'%') ";
            param.put("keyword",keyword);
        }
        if(ownerId != null){
            sql += " AND g.owner_id <> :ownerId";
            param.put("ownerId",ownerId);
        }
        Query query = em.createNativeQuery(sql, GroupClub.class);
        query.setMaxResults(10);
        if(page!=null){
            query.setFirstResult(page);
        }
        param.forEach(query::setParameter);

        return query.getResultList();
    }
}
