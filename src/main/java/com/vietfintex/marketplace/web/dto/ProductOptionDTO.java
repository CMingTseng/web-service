/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import java.io.Serializable;
import java.util.List;

public class ProductOptionDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long optionId;
    private Long storeId;
    private String optionType;
    private String optionName;
    private String description;
    private String comment;
    private String required;
    private short position;
    private String value;
    private String status;

    private List<ProductOptionVariantDTO> optionVariantList;

    public ProductOptionDTO() {
    }

    public ProductOptionDTO(Long optionId) {
        this.optionId = optionId;
    }

    public ProductOptionDTO(Long optionId, Long storeId, String optionType, String comment, String required, short position, String value, String status) {
        this.optionId = optionId;
        this.storeId = storeId;
        this.optionType = optionType;
        this.comment = comment;
        this.required = required;
        this.position = position;
        this.value = value;
        this.status = status;
    }

    public List<ProductOptionVariantDTO> getOptionVariantList() {
        return optionVariantList;
    }

    public void setOptionVariantList(List<ProductOptionVariantDTO> optionVariantList) {
        this.optionVariantList = optionVariantList;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public String getOptionName() {
        return optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        hash += (optionId != null ? optionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOptionDTO)) {
            return false;
        }
        ProductOptionDTO other = (ProductOptionDTO) object;
        if ((this.optionId == null && other.optionId != null) || (this.optionId != null && !this.optionId.equals(other.optionId))) {
            return false;
        }
        return true;
    }

}
