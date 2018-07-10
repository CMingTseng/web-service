/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Dell
 */
@Entity
@Table(name = "commission_category")
@NamedQueries({
        @NamedQuery(name = "CommissionCategory.findAll", query = "SELECT c FROM CommissionCategory c")})
public class CommissionCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "commission_category_id")
    private Long commissionCategoryId;
    @Basic(optional = false)
    @Column(name = "store_category_id")
    private long storeCategoryId;
    @Basic(optional = false)
    @Column(name = "group_root_id")
    private long groupRootId;
    @Basic(optional = false)
    @Column(name = "group_level")
    private int groupLevel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "commission")
    private Double commission;
    @Column(name = "status")
    private String status;

    public CommissionCategory() {
    }

    public CommissionCategory(Long commissionCategoryId) {
        this.commissionCategoryId = commissionCategoryId;
    }

    public CommissionCategory(Long commissionCategoryId, long storeCategoryId, long groupRootId, int groupLevel) {
        this.commissionCategoryId = commissionCategoryId;
        this.storeCategoryId = storeCategoryId;
        this.groupRootId = groupRootId;
        this.groupLevel = groupLevel;
    }

    public Long getCommissionCategoryId() {
        return commissionCategoryId;
    }

    public void setCommissionCategoryId(Long commissionCategoryId) {
        this.commissionCategoryId = commissionCategoryId;
    }

    public long getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(long storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public long getGroupRootId() {
        return groupRootId;
    }

    public void setGroupRootId(long groupRootId) {
        this.groupRootId = groupRootId;
    }

    public int getGroupLevel() {
        return groupLevel;
    }

    public void setGroupLevel(int groupLevel) {
        this.groupLevel = groupLevel;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
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
        hash += (commissionCategoryId != null ? commissionCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommissionCategory)) {
            return false;
        }
        CommissionCategory other = (CommissionCategory) object;
        if ((this.commissionCategoryId == null && other.commissionCategoryId != null) || (this.commissionCategoryId != null && !this.commissionCategoryId.equals(other.commissionCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.CommissionCategory[ commissionCategoryId=" + commissionCategoryId + " ]";
    }

}
