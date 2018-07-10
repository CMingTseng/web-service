/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import java.io.Serializable;

public class ProductOptionVariantDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long variantId;
    private String variantName;
    private Long optionId;
    private short position;
    private Double modifier;
    private String modifierType;
    private Double weightModifier;
    private String weightModifierType;
    private Double pointModifier;
    private String pointModifierType;
    private String status;

    public ProductOptionVariantDTO() {
    }

    public ProductOptionVariantDTO(Long variantId) {
        this.variantId = variantId;
    }

    public ProductOptionVariantDTO(Long variantId, Long optionId, short position, Double modifier, String modifierType, Double weightModifier, String weightModifierType, Double pointModifier, String poLongModifierType, String status) {
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
        if (!(object instanceof ProductOptionVariantDTO)) {
            return false;
        }
        ProductOptionVariantDTO other = (ProductOptionVariantDTO) object;
        if ((this.variantId == null && other.variantId != null) || (this.variantId != null && !this.variantId.equals(other.variantId))) {
            return false;
        }
        return true;
    }

}
