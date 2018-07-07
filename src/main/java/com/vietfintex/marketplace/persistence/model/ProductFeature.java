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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "product_feature")
public class ProductFeature implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "feature_id")
    private Long featureId;
    @Column(name = "feature_code")
    private String featureCode;
    @Column(name = "description")
    private String description;
    @Lob
    @Column(name = "full_description")
    private String fullDescription;
    @Basic(optional = false)
    @Column(name = "feature_type")
    private String featureType;
    @Lob
    @Column(name = "categories_path")
    private String categoriesPath;
    @Basic(optional = false)
    @Column(name = "parent_id")
    private int parentId;
    @Basic(optional = false)
    @Column(name = "display_on_product")
    private String displayOnProduct;
    @Basic(optional = false)
    @Column(name = "display_on_catalog")
    private String displayOnCatalog;
    @Basic(optional = false)
    @Column(name = "display_on_header")
    private String displayOnHeader;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "comparison")
    private String comparison;

    public ProductFeature() {
    }

    public ProductFeature(Long featureId) {
        this.featureId = featureId;
    }

    public ProductFeature(Long featureId, String featureType, int parentId, String displayOnProduct, String displayOnCatalog, String displayOnHeader, String status, short position, String comparison) {
        this.featureId = featureId;
        this.featureType = featureType;
        this.parentId = parentId;
        this.displayOnProduct = displayOnProduct;
        this.displayOnCatalog = displayOnCatalog;
        this.displayOnHeader = displayOnHeader;
        this.status = status;
        this.position = position;
        this.comparison = comparison;
    }

    public Long getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getFeatureType() {
        return featureType;
    }

    public void setFeatureType(String featureType) {
        this.featureType = featureType;
    }

    public String getCategoriesPath() {
        return categoriesPath;
    }

    public void setCategoriesPath(String categoriesPath) {
        this.categoriesPath = categoriesPath;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getDisplayOnProduct() {
        return displayOnProduct;
    }

    public void setDisplayOnProduct(String displayOnProduct) {
        this.displayOnProduct = displayOnProduct;
    }

    public String getDisplayOnCatalog() {
        return displayOnCatalog;
    }

    public void setDisplayOnCatalog(String displayOnCatalog) {
        this.displayOnCatalog = displayOnCatalog;
    }

    public String getDisplayOnHeader() {
        return displayOnHeader;
    }

    public void setDisplayOnHeader(String displayOnHeader) {
        this.displayOnHeader = displayOnHeader;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (featureId != null ? featureId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeature)) {
            return false;
        }
        ProductFeature other = (ProductFeature) object;
        if ((this.featureId == null && other.featureId != null) || (this.featureId != null && !this.featureId.equals(other.featureId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.ProductFeature[ featureId=" + featureId + " ]";
    }
    
}
