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
@Table(name = "product_global_option_link")
@NamedQueries({
    @NamedQuery(name = "ProductGlobalOptionLink.findAll", query = "SELECT p FROM ProductGlobalOptionLink p")})
public class ProductGlobalOptionLink implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "global_option_id")
    private Long globalOptionId;
    @Basic(optional = false)
    @Column(name = "option_id")
    private Long optionId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private Long productId;

    public ProductGlobalOptionLink() {
    }

    public ProductGlobalOptionLink(Long globalOptionId) {
        this.globalOptionId = globalOptionId;
    }

    public ProductGlobalOptionLink(Long globalOptionId, Long optionId, Long productId) {
        this.globalOptionId = globalOptionId;
        this.optionId = optionId;
        this.productId = productId;
    }

    public Long getGlobalOptionId() {
        return globalOptionId;
    }

    public void setGlobalOptionId(Long globalOptionId) {
        this.globalOptionId = globalOptionId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (globalOptionId != null ? globalOptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductGlobalOptionLink)) {
            return false;
        }
        ProductGlobalOptionLink other = (ProductGlobalOptionLink) object;
        if ((this.globalOptionId == null && other.globalOptionId != null) || (this.globalOptionId != null && !this.globalOptionId.equals(other.globalOptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.ProductGlobalOptionLink[ globalOptionId=" + globalOptionId + " ]";
    }
    
}
