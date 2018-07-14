/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.vietfintex.marketplace.persistence.model.Store;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dell
 */

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long productId;
    private Long categoryId;
    private String productCode;
    private String productName;
    private String productType;
    private String shortDescription;
    private String fullDescription;
    private String promoText;
    private String approved;
    private Double listPrice;
    private Long amount;
    private Double weight;
    private Long length;
    private Long width;
    private Long height;
    private Double shippingFreight;
    private Long lowAvailLimit;
    private Date createTime;
    private Date updatedTime;
    private String freeShipping;
    private String isReturnable;
    private Long returnPeriod;
    private Date availSince;
    private Long parentProductId;
    private String variationCode;
    private String variationOption;
    private String status;
    private List<ProductFeatureDTO> productFeatureList;
    private List<ProductOptionDTO> productOptionList;
    private StoreDTO store;

    public StoreDTO getStore() {
        return store;
    }

    public void setStore(StoreDTO store) {
        this.store = store;
    }

    private List<ImageLinkDTO> imageList;

    public List<ImageLinkDTO> getImageList() {
        return imageList;
    }

    public void setImageList(List<ImageLinkDTO> imageList) {
        this.imageList = imageList;
    }

    public List<ProductFeatureDTO> getProductFeatureList() {
        return productFeatureList;
    }

    public void setProductFeatureList(List<ProductFeatureDTO> productFeatureList) {
        this.productFeatureList = productFeatureList;
    }

    public List<ProductOptionDTO> getProductOptionList() {
        return productOptionList;
    }

    public void setProductOptionList(List<ProductOptionDTO> productOptionList) {
        this.productOptionList = productOptionList;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    public String getPromoText() {
        return promoText;
    }

    public void setPromoText(String promoText) {
        this.promoText = promoText;
    }


    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Double getShippingFreight() {
        return shippingFreight;
    }

    public void setShippingFreight(Double shippingFreight) {
        this.shippingFreight = shippingFreight;
    }

    public Long getLowAvailLimit() {
        return lowAvailLimit;
    }

    public void setLowAvailLimit(Long lowAvailLimit) {
        this.lowAvailLimit = lowAvailLimit;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(String isReturnable) {
        this.isReturnable = isReturnable;
    }

    public Long getReturnPeriod() {
        return returnPeriod;
    }

    public void setReturnPeriod(Long returnPeriod) {
        this.returnPeriod = returnPeriod;
    }

    public Date getAvailSince() {
        return availSince;
    }

    public void setAvailSince(Date availSince) {
        this.availSince = availSince;
    }

    public Long getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(Long parentProductId) {
        this.parentProductId = parentProductId;
    }

    public String getVariationCode() {
        return variationCode;
    }

    public void setVariationCode(String variationCode) {
        this.variationCode = variationCode;
    }

    public String getVariationOption() {
        return variationOption;
    }

    public void setVariationOption(String variationOption) {
        this.variationOption = variationOption;
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
        hash += (productId != null ? productId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductDTO)) {
            return false;
        }
        ProductDTO other = (ProductDTO) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

}
