package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "category_id")
    private Long categoryId;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_description")
    private String categoryDescription;
    @Column(name = "timestamp")
    private Long timestamp;
    @Column(name = "is_trash")
    private String isTrash;
    @Column(name = "status")
    private String status;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getIsTrash() {
        return isTrash;
    }

    public void setIsTrash(String isTrash) {
        this.isTrash = isTrash;
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
        hash += (categoryId != null ? categoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupClub)) {
            return false;
        }
        Category other = (Category) object;
        if (this.categoryId == null && other.categoryId != null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.Category[ categoryId=" + categoryId + " ]";
    }

}
