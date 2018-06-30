/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "admin_permission")
@NamedQueries({
    @NamedQuery(name = "AdminPermission.findAll", query = "SELECT a FROM AdminPermission a")})
public class AdminPermission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admin_permission_id")
    private Long adminPermissionId;
    @Basic(optional = false)
    @Column(name = "admin_section_id")
    private long adminSectionId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "status")
    private String status;

    public AdminPermission() {
    }

    public AdminPermission(Long adminPermissionId) {
        this.adminPermissionId = adminPermissionId;
    }

    public AdminPermission(Long adminPermissionId, long adminSectionId, long userId) {
        this.adminPermissionId = adminPermissionId;
        this.adminSectionId = adminSectionId;
        this.userId = userId;
    }

    public Long getAdminPermissionId() {
        return adminPermissionId;
    }

    public void setAdminPermissionId(Long adminPermissionId) {
        this.adminPermissionId = adminPermissionId;
    }

    public long getAdminSectionId() {
        return adminSectionId;
    }

    public void setAdminSectionId(long adminSectionId) {
        this.adminSectionId = adminSectionId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
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
        hash += (adminPermissionId != null ? adminPermissionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminPermission)) {
            return false;
        }
        AdminPermission other = (AdminPermission) object;
        if ((this.adminPermissionId == null && other.adminPermissionId != null) || (this.adminPermissionId != null && !this.adminPermissionId.equals(other.adminPermissionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.AdminPermission[ adminPermissionId=" + adminPermissionId + " ]";
    }
    
}
