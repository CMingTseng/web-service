package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "commission_group")
public class CommissionGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "commission_group_id")
    private Long commissionGroupId;
    @Column(name = "group_id")
    private Long groupId;
    @Column(name = "level")
    private int level;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "store_category_id")
    private Long storeCategoryId;
    @Column(name = "commission")
    private Double commission;

    public Long getCommissionGroupId() {
        return commissionGroupId;
    }

    public void setCommissionGroupId(Long commissionGroupId) {
        this.commissionGroupId = commissionGroupId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(Long storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommissionGroup)) {
            return false;
        }
        CommissionGroup other = (CommissionGroup) object;
        if (this.commissionGroupId == null && other.commissionGroupId != null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.CommissionGroup[ commissionGroupId=" + commissionGroupId + " ]";
    }

}
