package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.GroupMember;
import com.vietfintex.marketplace.persistence.repo.GroupMemberCustomRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupMemberCustomRepoImpl implements GroupMemberCustomRepo {
    @PersistenceContext
    private EntityManager em;

    @Override
    public GroupMember findGroupMemberByGroupUser(Long groupMemberId,Long groupId, Long userId) {
        Map<String, Object> param = new HashMap<>();
        String sql = "SELECT * FROM group_member gm WHERE 1=1 ";

        if(groupMemberId != null){
            sql += " AND gm.group_member_id = :groupMemberId";
            param.put("groupMemberId",groupMemberId);
        }

        if(groupId != null){
            sql += " AND gm.group_id = :groupId ";
            param.put("groupId",groupId);
        }
        if (userId != null){
            sql += "AND gm.user_id = :userId";
            param.put("userId",userId);
        }
        Query query = em.createNativeQuery(sql,GroupMember.class);
        param.forEach(query::setParameter);
        List<GroupMember> result = query.getResultList();
        if(result.size() > 0){
            return result.get(0);
        }else{
            return  null;
        }
    }
}
