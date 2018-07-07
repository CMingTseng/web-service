/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "product_option_variant")
public class ProductOptionVariant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "variant_id")
    private Long variantId;
    @Column(name = "variant_name")
    private String variantName;
    @Basic(optional = false)
    @Column(name = "option_id")
    private Long optionId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "modifier")
    private Double modifier;
    @Basic(optional = false)
    @Column(name = "modifier_type")
    private String modifierType;
    @Basic(optional = false)
    @Column(name = "weight_modifier")
    private Double weightModifier;
    @Basic(optional = false)
    @Column(name = "weight_modifier_type")
    private String weightModifierType;
    @Basic(optional = false)
    @Column(name = "point_modifier")
    private Double pointModifier;
    @Basic(optional = false)
    @Column(name = "point_modifier_type")
    private String pointModifierType;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public ProductOptionVariant() {
    }

    public ProductOptionVariant(Long variantId) {
        this.variantId = variantId;
    }

    public ProductOptionVariant(Long variantId, Long optionId, short position, Double modifier, String modifierType, Double weightModifier, String weightModifierType, Double pointModifier, String poLongModifierType, String status) {
        this.variantId = variantId;
        this.optionId = optionId;
        this.position = position;
        this.modifier = modifier;
        this.modifierType = modifierType;
        this.weightModifier = weightModifier;
        this.weightModifierType = weightModifierType;
        this.pointModifier = pointModifier;
        this.pointModifierType = pointModifierType;
        this.status = status;
    }

    public Long getVariantId() {
        return variantId;
    }

    public void setVariantId(Long variantId) {
        this.variantId = variantId;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public Double getModifier() {
        return modifier;
    }

    public void setModifier(Double modifier) {
        this.modifier = modifier;
    }

    public String getModifierType() {
        return modifierType;
    }

    public void setModifierType(String modifierType) {
        this.modifierType = modifierType;
    }

    public Double getWeightModifier() {
        return weightModifier;
    }

    public void setWeightModifier(Double weightModifier) {
        this.weightModifier = weightModifier;
    }

    public String getWeightModifierType() {
        return weightModifierType;
    }

    public void setWeightModifierType(String weightModifierType) {
        this.weightModifierType = weightModifierType;
    }

    public Double getPointModifier() {
        return pointModifier;
    }

    public void setPointModifier(Double pointModifier) {
        this.pointModifier = pointModifier;
    }

    public String getPointModifierType() {
        return pointModifierType;
    }

    public void setPointModifierType(String pointModifierType) {
        this.pointModifierType = pointModifierType;
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
        hash += (variantId != null ? variantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptionVariant)) {
            return false;
        }
        ProductOptionVariant other = (ProductOptionVariant) object;
        if ((this.variantId == null && other.variantId != null) || (this.variantId != null && !this.variantId.equals(other.variantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.ProductOptionVariant[ variantId=" + variantId + " ]";
    }
    
}
