package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "store_category")
public class StoreCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store_category_id")
    private Long storeCategoryId;
    @Column(name = "store_id")
    private Long storeId;
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "status")
    private String status;

    public Long getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(Long storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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
        hash += (storeCategoryId != null ? storeCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Store)) {
            return false;
        }
        StoreCategory other = (StoreCategory) object;
        if (this.storeCategoryId == null && other.storeCategoryId != null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.StoreCategory[ storeCategoryId=" + storeCategoryId + " ]";
    }
}
