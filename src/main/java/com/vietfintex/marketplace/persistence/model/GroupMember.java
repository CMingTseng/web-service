/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author thiennv15
 */
@Entity
@Table(name = "group_member")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupMember.findAll", query = "SELECT g FROM GroupMember g")})
public class GroupMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GroupMemberPK groupMemberPK;
    @Column(name = "status")
    private String status;

    public GroupMember() {
    }

    public GroupMember(GroupMemberPK groupMemberPK) {
        this.groupMemberPK = groupMemberPK;
    }

    public GroupMember(long groupId, long userId) {
        this.groupMemberPK = new GroupMemberPK(groupId, userId);
    }

    public GroupMemberPK getGroupMemberPK() {
        return groupMemberPK;
    }

    public void setGroupMemberPK(GroupMemberPK groupMemberPK) {
        this.groupMemberPK = groupMemberPK;
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
        hash += (groupMemberPK != null ? groupMemberPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupMember)) {
            return false;
        }
        GroupMember other = (GroupMember) object;
        if ((this.groupMemberPK == null && other.groupMemberPK != null) || (this.groupMemberPK != null && !this.groupMemberPK.equals(other.groupMemberPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.persistence.model.GroupMember[ groupMemberPK=" + groupMemberPK + " ]";
    }
    
}
