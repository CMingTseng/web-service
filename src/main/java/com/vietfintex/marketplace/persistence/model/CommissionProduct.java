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
@Table(name = "commission_product")
@NamedQueries({
        @NamedQuery(name = "CommissionProduct.findAll", query = "SELECT c FROM CommissionProduct c")})
public class CommissionProduct implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "commission_product_id")
    private Long commissionProductId;
    @Basic(optional = false)
    @Column(name = "store_product_id")
    private long storeProductId;
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

    public CommissionProduct() {
    }

    public CommissionProduct(Long commissionProductId) {
        this.commissionProductId = commissionProductId;
    }

    public CommissionProduct(Long commissionProductId, long storeProductId, long groupRootId, int groupLevel) {
        this.commissionProductId = commissionProductId;
        this.storeProductId = storeProductId;
        this.groupRootId = groupRootId;
        this.groupLevel = groupLevel;
    }

    public Long getCommissionProductId() {
        return commissionProductId;
    }

    public void setCommissionProductId(Long commissionProductId) {
        this.commissionProductId = commissionProductId;
    }

    public long getStoreProductId() {
        return storeProductId;
    }

    public void setStoreProductId(long storeProductId) {
        this.storeProductId = storeProductId;
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
        hash += (commissionProductId != null ? commissionProductId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommissionProduct)) {
            return false;
        }
        CommissionProduct other = (CommissionProduct) object;
        if ((this.commissionProductId == null && other.commissionProductId != null) || (this.commissionProductId != null && !this.commissionProductId.equals(other.commissionProductId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.CommissionProduct[ commissionProductId=" + commissionProductId + " ]";
    }

}
