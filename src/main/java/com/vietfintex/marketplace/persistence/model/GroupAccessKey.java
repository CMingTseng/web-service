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
 * @author thiennv15
 */
@Entity
@Table(name = "group_access_key")
public class GroupAccessKey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "access_key_id")
    private Long accessKeyId;
    @Column(name = "group_id")
    private Long groupId;
    @Column(name = "access_key")
    private String accessKey;
    @Column(name = "is_club")
    private String isClub;
    @Column(name = "status")
    private String status;

    public GroupAccessKey() {
    }

    public GroupAccessKey(Long accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public Long getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(Long accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getIsClub() {
        return isClub;
    }

    public void setIsClub(String isClub) {
        this.isClub = isClub;
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
        hash += (accessKeyId != null ? accessKeyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupAccessKey)) {
            return false;
        }
        GroupAccessKey other = (GroupAccessKey) object;
        if ((this.accessKeyId == null && other.accessKeyId != null) || (this.accessKeyId != null && !this.accessKeyId.equals(other.accessKeyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.persistence.model.GroupAccessKey[ accessKeyId=" + accessKeyId + " ]";
    }
    
}
