/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "group_member")
public class GroupMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "group_member_id")
    private Long groupMemberId;
    @Column(name = "group_id")
    private Long groupId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "status")
    private String status;

    public GroupMember() {
    }

    public GroupMember(Long groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public Long getGroupMemberId() {
        return groupMemberId;
    }

    public void setGroupMemberId(Long groupMemberId) {
        this.groupMemberId = groupMemberId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupMemberId != null ? groupMemberId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupMember)) {
            return false;
        }
        GroupMember other = (GroupMember) object;
        if ((this.groupMemberId == null && other.groupMemberId != null) || (this.groupMemberId != null && !this.groupMemberId.equals(other.groupMemberId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.GroupMember[ groupMemberId=" + groupMemberId + " ]";
    }
    
}
