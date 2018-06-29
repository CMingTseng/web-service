/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author thiennv15
 */
@Embeddable
public class GroupMemberPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "group_id")
    private long groupId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private long userId;

    public GroupMemberPK() {
    }

    public GroupMemberPK(long groupId, long userId) {
        this.groupId = groupId;
        this.userId = userId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) groupId;
        hash += (int) userId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupMemberPK)) {
            return false;
        }
        GroupMemberPK other = (GroupMemberPK) object;
        if (this.groupId != other.groupId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.persistence.model.GroupMemberPK[ groupId=" + groupId + ", userId=" + userId + " ]";
    }
    
}
