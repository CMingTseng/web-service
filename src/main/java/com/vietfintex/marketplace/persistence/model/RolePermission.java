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
@Table(name = "role_permission")
@NamedQueries({
    @NamedQuery(name = "RolePermission.findAll", query = "SELECT r FROM RolePermission r")})
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_permission_map_id")
    private Long rolePermissionMapId;
    @Basic(optional = false)
    @Column(name = "role_id")
    private long roleId;
    @Basic(optional = false)
    @Column(name = "admin_section_id")
    private long adminSectionId;
    @Column(name = "status")
    private String status;

    public RolePermission() {
    }

    public RolePermission(Long rolePermissionMapId) {
        this.rolePermissionMapId = rolePermissionMapId;
    }

    public RolePermission(Long rolePermissionMapId, long roleId, long adminSectionId) {
        this.rolePermissionMapId = rolePermissionMapId;
        this.roleId = roleId;
        this.adminSectionId = adminSectionId;
    }

    public Long getRolePermissionMapId() {
        return rolePermissionMapId;
    }

    public void setRolePermissionMapId(Long rolePermissionMapId) {
        this.rolePermissionMapId = rolePermissionMapId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public long getAdminSectionId() {
        return adminSectionId;
    }

    public void setAdminSectionId(long adminSectionId) {
        this.adminSectionId = adminSectionId;
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
        hash += (rolePermissionMapId != null ? rolePermissionMapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RolePermission)) {
            return false;
        }
        RolePermission other = (RolePermission) object;
        if ((this.rolePermissionMapId == null && other.rolePermissionMapId != null) || (this.rolePermissionMapId != null && !this.rolePermissionMapId.equals(other.rolePermissionMapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.RolePermission[ rolePermissionMapId=" + rolePermissionMapId + " ]";
    }
    
}
