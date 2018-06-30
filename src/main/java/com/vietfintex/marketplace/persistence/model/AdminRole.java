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
@Table(name = "admin_role")
@NamedQueries({
    @NamedQuery(name = "AdminRole.findAll", query = "SELECT a FROM AdminRole a")})
public class AdminRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admin_role_id")
    private Long adminRoleId;
    @Basic(optional = false)
    @Column(name = "role_id")
    private long roleId;
    @Basic(optional = false)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "status")
    private String status;

    public AdminRole() {
    }

    public AdminRole(Long adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public AdminRole(Long adminRoleId, long roleId, long userId) {
        this.adminRoleId = adminRoleId;
        this.roleId = roleId;
        this.userId = userId;
    }

    public Long getAdminRoleId() {
        return adminRoleId;
    }

    public void setAdminRoleId(Long adminRoleId) {
        this.adminRoleId = adminRoleId;
    }

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
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
        hash += (adminRoleId != null ? adminRoleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdminRole)) {
            return false;
        }
        AdminRole other = (AdminRole) object;
        if ((this.adminRoleId == null && other.adminRoleId != null) || (this.adminRoleId != null && !this.adminRoleId.equals(other.adminRoleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.AdminRole[ adminRoleId=" + adminRoleId + " ]";
    }
    
}
