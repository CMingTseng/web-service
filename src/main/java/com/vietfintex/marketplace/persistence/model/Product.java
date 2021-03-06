/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Long productId;
    @Basic(optional = false)
    @Column(name = "category_id")
    private Long categoryId;
    @Basic(optional = false)
    @Column(name = "product_code")
    private String productCode;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
    @Basic(optional = false)
    @Column(name = "product_type")
    private String productType;
    @Lob
    @Column(name = "short_description")
    private String shortDescription;
    @Lob
    @Column(name = "full_description")
    private String fullDescription;
    @Lob
    @Column(name = "promo_text")
    private String promoText;
    @Basic(optional = false)
    @Column(name = "store_id")
    private Long storeId;
    @Basic(optional = false)
    @Column(name = "approved")
    private String approved;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "list_price")
    private Double listPrice;
    @Basic(optional = false)
    @Column(name = "amount")
    private Long amount;
    @Basic(optional = false)
    @Column(name = "weight")
    private Double weight;
    @Basic(optional = false)
    @Column(name = "length")
    private Long length;
    @Basic(optional = false)
    @Column(name = "width")
    private Long width;
    @Basic(optional = false)
    @Column(name = "height")
    private Long height;
    @Basic(optional = false)
    @Column(name = "shipping_freight")
    private Double shippingFreight;
    @Basic(optional = false)
    @Column(name = "low_avail_limit")
    private Long lowAvailLimit;
    @Basic(optional = false)
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Basic(optional = false)
    @Column(name = "updated_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;
    @Basic(optional = false)
    @Column(name = "free_shipping")
    private String freeShipping;
    @Basic(optional = false)
    @Column(name = "is_returnable")
    private String isReturnable;
    @Basic(optional = false)
    @Column(name = "return_period")
    private Long returnPeriod;
    @Basic(optional = false)
    @Column(name = "avail_since")
    @Temporal(TemporalType.TIMESTAMP)
    private Date availSince;
    @Column(name = "parent_product_id")
    private Long parentProductId;
    @Column(name = "variation_code")
    private String variationCode;
    @Column(name = "variation_option")
    private String variationOption;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Column(name = "refund_term")
    private String refundTerm;
    @Column(name = "product_group_type")
    private String productGroupType;

    public Product() {
    }

    public Product(Long productId) {
        this.productId = productId;
    }

    public Product(Long productId, Long categoryId, String productCode, String productName, String productType, Long storeId, String approved, Double listPrice, Long amount, Double weight, Long length, Long width, Long height, Double shippingFreight, Long lowAvailLimit, Date createTime, Date updatedTime, String freeShipping, String isReturnable, Long returnPeriod, Date availSince, String status) {
        this.productId = productId;
        this.categoryId = categoryId;
        this.productCode = productCode;
        this.productName = productName;
        this.productType = productType;
        this.storeId = storeId;
        this.approved = approved;
        this.listPrice = listPrice;
        this.amount = amount;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.shippingFreight = shippingFreight;
        this.lowAvailLimit = lowAvailLimit;
        this.createTime = createTime;
        this.updatedTime = updatedTime;
        this.freeShipping = freeShipping;
        this.isReturnable = isReturnable;
        this.returnPeriod = returnPeriod;
        this.availSince = availSince;
        this.status = status;
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

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
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

    public String getRefundTerm() {
        return refundTerm;
    }

    public void setRefundTerm(String refundTerm) {
        this.refundTerm = refundTerm;
    }

    public String getProductGroupType() {
        return productGroupType;
    }

    public void setProductGroupType(String productGroupType) {
        this.productGroupType = productGroupType;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.productId == null && other.productId != null) || (this.productId != null && !this.productId.equals(other.productId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.Product[ productId=" + productId + " ]";
    }
    
}
