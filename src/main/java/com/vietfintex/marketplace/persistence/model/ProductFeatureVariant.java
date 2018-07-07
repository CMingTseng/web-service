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
@Table(name = "product_feature_variant")
@NamedQueries({
    @NamedQuery(name = "ProductFeatureVariant.findAll", query = "SELECT p FROM ProductFeatureVariant p")})
public class ProductFeatureVariant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "variant_id")
    private Integer variantId;
    @Column(name = "variant_name")
    private String variantName;
    @Basic(optional = false)
    @Column(name = "feature_id")
    private int featureId;
    @Column(name = "url")
    private String url;
    @Column(name = "position")
    private Short position;

    public ProductFeatureVariant() {
    }

    public ProductFeatureVariant(Integer variantId) {
        this.variantId = variantId;
    }

    public ProductFeatureVariant(Integer variantId, int featureId) {
        this.variantId = variantId;
        this.featureId = featureId;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Short getPosition() {
        return position;
    }

    public void setPosition(Short position) {
        this.position = position;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (variantId != null ? variantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductFeatureVariant)) {
            return false;
        }
        ProductFeatureVariant other = (ProductFeatureVariant) object;
        if ((this.variantId == null && other.variantId != null) || (this.variantId != null && !this.variantId.equals(other.variantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.ProductFeatureVariant[ variantId=" + variantId + " ]";
    }
    
}
