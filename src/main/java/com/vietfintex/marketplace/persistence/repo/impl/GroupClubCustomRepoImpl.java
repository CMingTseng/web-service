package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.GroupClub;
import com.vietfintex.marketplace.persistence.repo.GroupClubCustomRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.List;

public class GroupClubCustomRepoImpl implements GroupClubCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<GroupClub> getListGroupClub(Long groupId, String privacy, String keyword,BigInteger ownerId) {
        boolean first = false;
        String sql = "SELECT g.* FROM group_club g ";
        if(groupId != null){
            sql += " WHERE g.group_id ="+groupId;
            first = true;
        }
        if(privacy != null && !"".equals(privacy)){
            if(first)
                sql +=" AND ";
            else
                sql += " WHERE ";
            first = true;
            sql += " g.privacy = '"+privacy+"'  ";
        }
        if(keyword != null && !"".equals(keyword)){
            if(first)
                sql +=" AND ";
            else
                sql += " WHERE ";
            first = true;
            sql += " g.group_name like '%"+keyword+"%'  ";
        }
        if(ownerId != null){
            if(first)
                sql +=" AND ";
            else
                sql += " WHERE ";
            sql += " g.owner_id = "+ownerId+"  ";
        }
//        Query query = em.createQuery(sql);
        Query query = em.createNativeQuery(sql, GroupClub.class);
        return query.getResultList();
    }
}
