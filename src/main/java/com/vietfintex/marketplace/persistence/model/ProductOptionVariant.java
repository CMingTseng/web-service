/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "product_option_variant")
@NamedQueries({
    @NamedQuery(name = "ProductOptionVariant.findAll", query = "SELECT p FROM ProductOptionVariant p")})
public class ProductOptionVariant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "variant_id")
    private Integer variantId;
    @Column(name = "variant_name")
    private String variantName;
    @Basic(optional = false)
    @Column(name = "option_id")
    private int optionId;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "modifier")
    private BigDecimal modifier;
    @Basic(optional = false)
    @Column(name = "modifier_type")
    private Character modifierType;
    @Basic(optional = false)
    @Column(name = "weight_modifier")
    private BigDecimal weightModifier;
    @Basic(optional = false)
    @Column(name = "weight_modifier_type")
    private Character weightModifierType;
    @Basic(optional = false)
    @Column(name = "point_modifier")
    private BigDecimal pointModifier;
    @Basic(optional = false)
    @Column(name = "point_modifier_type")
    private Character pointModifierType;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;

    public ProductOptionVariant() {
    }

    public ProductOptionVariant(Integer variantId) {
        this.variantId = variantId;
    }

    public ProductOptionVariant(Integer variantId, int optionId, short position, BigDecimal modifier, Character modifierType, BigDecimal weightModifier, Character weightModifierType, BigDecimal pointModifier, Character pointModifierType, Character status) {
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

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public BigDecimal getModifier() {
        return modifier;
    }

    public void setModifier(BigDecimal modifier) {
        this.modifier = modifier;
    }

    public Character getModifierType() {
        return modifierType;
    }

    public void setModifierType(Character modifierType) {
        this.modifierType = modifierType;
    }

    public BigDecimal getWeightModifier() {
        return weightModifier;
    }

    public void setWeightModifier(BigDecimal weightModifier) {
        this.weightModifier = weightModifier;
    }

    public Character getWeightModifierType() {
        return weightModifierType;
    }

    public void setWeightModifierType(Character weightModifierType) {
        this.weightModifierType = weightModifierType;
    }

    public BigDecimal getPointModifier() {
        return pointModifier;
    }

    public void setPointModifier(BigDecimal pointModifier) {
        this.pointModifier = pointModifier;
    }

    public Character getPointModifierType() {
        return pointModifierType;
    }

    public void setPointModifierType(Character pointModifierType) {
        this.pointModifierType = pointModifierType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
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
