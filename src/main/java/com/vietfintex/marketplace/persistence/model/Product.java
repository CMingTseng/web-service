/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.persistence.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "product")
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p")})
public class Product implements Serializable {

    @Basic(optional = false)
    @Column(name = "category_id")
    private int categoryId;
    @Basic(optional = false)
    @Column(name = "product_name")
    private String productName;
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
    private int storeId;
    @Basic(optional = false)
    @Column(name = "amount")
    private int amount;
    @Basic(optional = false)
    @Column(name = "low_avail_limit")
    private int lowAvailLimit;
    @Basic(optional = false)
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Basic(optional = false)
    @Column(name = "updated_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedTime;
    @Basic(optional = false)
    @Column(name = "avail_since")
    @Temporal(TemporalType.TIMESTAMP)
    private Date availSince;
    @Column(name = "parent_product_id")
    private Integer parentProductId;
    @Column(name = "variation_option")
    private String variationOption;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_id")
    private Integer productId;
    @Basic(optional = false)
    @Column(name = "product_code")
    private String productCode;
    @Basic(optional = false)
    @Column(name = "product_type")
    private Character productType;
    @Basic(optional = false)
    @Column(name = "status")
    private Character status;
    @Basic(optional = false)
    @Column(name = "approved")
    private Character approved;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "list_price")
    private BigDecimal listPrice;
    @Basic(optional = false)
    @Column(name = "weight")
    private BigDecimal weight;
    @Basic(optional = false)
    @Column(name = "length")
    private int length;
    @Basic(optional = false)
    @Column(name = "width")
    private int width;
    @Basic(optional = false)
    @Column(name = "height")
    private int height;
    @Basic(optional = false)
    @Column(name = "shipping_freight")
    private BigDecimal shippingFreight;
    @Basic(optional = false)
    @Column(name = "timestamp")
    private int timestamp;
    @Basic(optional = false)
    @Column(name = "updated_timestamp")
    private int updatedTimestamp;
    @Basic(optional = false)
    @Column(name = "free_shipping")
    private Character freeShipping;
    @Basic(optional = false)
    @Column(name = "is_returnable")
    private Character isReturnable;
    @Basic(optional = false)
    @Column(name = "return_period")
    private int returnPeriod;
    @Basic(optional = false)
    @Column(name = "out_of_stock_actions")
    private Character outOfStockActions;
    @Basic(optional = false)
    @Column(name = "min_qty")
    private short minQty;
    @Basic(optional = false)
    @Column(name = "max_qty")
    private short maxQty;
    @Basic(optional = false)
    @Column(name = "qty_step")
    private short qtyStep;
    @Basic(optional = false)
    @Column(name = "list_qty_count")
    private short listQtyCount;
    @Basic(optional = false)
    @Column(name = "tax_ids")
    private String taxIds;
    @Basic(optional = false)
    @Column(name = "age_verification")
    private Character ageVerification;
    @Basic(optional = false)
    @Column(name = "age_limit")
    private short ageLimit;
    @Column(name = "variation_code")
    private String variationCode;
    @Column(name = "variation_options")
    private String variationOptions;
    @Basic(optional = false)
    @Column(name = "product_hash")
    private String productHash;
    @Column(name = "package_type")
    private String packageType;
    @Column(name = "short_descrition")
    private Integer shortDescrition;
    @Lob
    @Column(name = "long_description")
    private String longDescription;

    public Product() {
    }

    public Product(Integer productId) {
        this.productId = productId;
    }

    public Product(Integer productId, String productCode, Character productType, Character status, long storeId, Character approved, BigDecimal listPrice, BigDecimal weight, int length, int width, int height, BigDecimal shippingFreight, int timestamp, int updatedTimestamp, Character freeShipping, Character isReturnable, int returnPeriod, int availSince, Character outOfStockActions, short minQty, short maxQty, short qtyStep, short listQtyCount, String taxIds, Character ageVerification, short ageLimit, int parentProductId, String productHash) {
        this.productId = productId;
        this.productCode = productCode;
        this.productType = productType;
        this.status = status;
        this.storeId = storeId;
        this.approved = approved;
        this.listPrice = listPrice;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
        this.shippingFreight = shippingFreight;
        this.timestamp = timestamp;
        this.updatedTimestamp = updatedTimestamp;
        this.freeShipping = freeShipping;
        this.isReturnable = isReturnable;
        this.returnPeriod = returnPeriod;
        this.availSince = availSince;
        this.outOfStockActions = outOfStockActions;
        this.minQty = minQty;
        this.maxQty = maxQty;
        this.qtyStep = qtyStep;
        this.listQtyCount = listQtyCount;
        this.taxIds = taxIds;
        this.ageVerification = ageVerification;
        this.ageLimit = ageLimit;
        this.parentProductId = parentProductId;
        this.productHash = productHash;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Character getProductType() {
        return productType;
    }

    public void setProductType(Character productType) {
        this.productType = productType;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public Character getApproved() {
        return approved;
    }

    public void setApproved(Character approved) {
        this.approved = approved;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BigDecimal getShippingFreight() {
        return shippingFreight;
    }

    public void setShippingFreight(BigDecimal shippingFreight) {
        this.shippingFreight = shippingFreight;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(int updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    public Character getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Character freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Character getIsReturnable() {
        return isReturnable;
    }

    public void setIsReturnable(Character isReturnable) {
        this.isReturnable = isReturnable;
    }

    public int getReturnPeriod() {
        return returnPeriod;
    }

    public void setReturnPeriod(int returnPeriod) {
        this.returnPeriod = returnPeriod;
    }

    public int getAvailSince() {
        return availSince;
    }

    public void setAvailSince(int availSince) {
        this.availSince = availSince;
    }

    public Character getOutOfStockActions() {
        return outOfStockActions;
    }

    public void setOutOfStockActions(Character outOfStockActions) {
        this.outOfStockActions = outOfStockActions;
    }

    public short getMinQty() {
        return minQty;
    }

    public void setMinQty(short minQty) {
        this.minQty = minQty;
    }

    public short getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(short maxQty) {
        this.maxQty = maxQty;
    }

    public short getQtyStep() {
        return qtyStep;
    }

    public void setQtyStep(short qtyStep) {
        this.qtyStep = qtyStep;
    }

    public short getListQtyCount() {
        return listQtyCount;
    }

    public void setListQtyCount(short listQtyCount) {
        this.listQtyCount = listQtyCount;
    }

    public String getTaxIds() {
        return taxIds;
    }

    public void setTaxIds(String taxIds) {
        this.taxIds = taxIds;
    }

    public Character getAgeVerification() {
        return ageVerification;
    }

    public void setAgeVerification(Character ageVerification) {
        this.ageVerification = ageVerification;
    }

    public short getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(short ageLimit) {
        this.ageLimit = ageLimit;
    }

    public int getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(int parentProductId) {
        this.parentProductId = parentProductId;
    }

    public String getVariationCode() {
        return variationCode;
    }

    public void setVariationCode(String variationCode) {
        this.variationCode = variationCode;
    }

    public String getVariationOptions() {
        return variationOptions;
    }

    public void setVariationOptions(String variationOptions) {
        this.variationOptions = variationOptions;
    }

    public String getProductHash() {
        return productHash;
    }

    public void setProductHash(String productHash) {
        this.productHash = productHash;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Integer getShortDescrition() {
        return shortDescrition;
    }

    public void setShortDescrition(Integer shortDescrition) {
        this.shortDescrition = shortDescrition;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
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

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getLowAvailLimit() {
        return lowAvailLimit;
    }

    public void setLowAvailLimit(int lowAvailLimit) {
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

    public Date getAvailSince() {
        return availSince;
    }

    public void setAvailSince(Date availSince) {
        this.availSince = availSince;
    }

    public Integer getParentProductId() {
        return parentProductId;
    }

    public void setParentProductId(Integer parentProductId) {
        this.parentProductId = parentProductId;
    }

    public String getVariationOption() {
        return variationOption;
    }

    public void setVariationOption(String variationOption) {
        this.variationOption = variationOption;
    }
    
}
