/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long orderId;
    private String isParentOrder;
    private Long parentOrderId;
    private Long storeId;
    private Long issuerId;
    private Long userId;
    private Double total;
    private Double subtotal;
    private Double discount;
    private Double subtotalDiscount;
    private Double paymentSurcharge;
    private String shippingIds;
    private Double shippingCost;
    private Date createTime;
    private String status;
    private String notes;
    private String details;
    private String firstname;
    private String lastname;
    private String company;
    private String bFirstname;
    private String bLastname;
    private String bAddress;
    private String bAddress2;
    private String bCity;
    private String bCounty;
    private String bState;
    private String bCountry;
    private String bZipcode;
    private String bPhone;
    private String sFirstname;
    private String sLastname;
    private String sAddress;
    private String sAddress2;
    private String sCity;
    private String sCounty;
    private String sState;
    private String sCountry;
    private String sZipcode;
    private String sPhone;
    private String sAddressType;
    private String phone;
    private String fax;
    private String url;
    private String email;
    private Long paymentId;
    private String taxExempt;
    private String ipAddress;
    private Long repaid;
    private List<OrderDetailDTO> orderDetailList;

    public OrderDTO() {
    }

    public OrderDTO(Long orderId) {
        this.orderId = orderId;
    }

    public OrderDTO(Long orderId, String isParentOrder, Long parentOrderId, Long storeId, Long userId, Double total, Double subtotal, Double discount, Double subtotalDiscount, Double paymentSurcharge, String shippingIds, Double shippingCost, Date createTime, String status, String firstname, String lastname, String company, String bFirstname, String bLastname, String bAddress, String bAddress2, String bCity, String bCounty, String bState, String bCountry, String bZipcode, String bPhone, String sFirstname, String sLastname, String sAddress, String sAddress2, String sCity, String sCounty, String sState, String sCountry, String sZipcode, String sPhone, String sAddressType, String phone, String fax, String url, String email, Long paymentId, String taxExempt, String ipAddress, Long repaid) {
        this.orderId = orderId;
        this.isParentOrder = isParentOrder;
        this.parentOrderId = parentOrderId;
        this.storeId = storeId;
        this.userId = userId;
        this.total = total;
        this.subtotal = subtotal;
        this.discount = discount;
        this.subtotalDiscount = subtotalDiscount;
        this.paymentSurcharge = paymentSurcharge;
        this.shippingIds = shippingIds;
        this.shippingCost = shippingCost;
        this.createTime = createTime;
        this.status = status;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.bFirstname = bFirstname;
        this.bLastname = bLastname;
        this.bAddress = bAddress;
        this.bAddress2 = bAddress2;
        this.bCity = bCity;
        this.bCounty = bCounty;
        this.bState = bState;
        this.bCountry = bCountry;
        this.bZipcode = bZipcode;
        this.bPhone = bPhone;
        this.sFirstname = sFirstname;
        this.sLastname = sLastname;
        this.sAddress = sAddress;
        this.sAddress2 = sAddress2;
        this.sCity = sCity;
        this.sCounty = sCounty;
        this.sState = sState;
        this.sCountry = sCountry;
        this.sZipcode = sZipcode;
        this.sPhone = sPhone;
        this.sAddressType = sAddressType;
        this.phone = phone;
        this.fax = fax;
        this.url = url;
        this.email = email;
        this.paymentId = paymentId;
        this.taxExempt = taxExempt;
        this.ipAddress = ipAddress;
        this.repaid = repaid;
    }

    public List<OrderDetailDTO> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetailDTO> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getIsParentOrder() {
        return isParentOrder;
    }

    public void setIsParentOrder(String isParentOrder) {
        this.isParentOrder = isParentOrder;
    }

    public Long getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(Long parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(Long issuerId) {
        this.issuerId = issuerId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getSubtotalDiscount() {
        return subtotalDiscount;
    }

    public void setSubtotalDiscount(Double subtotalDiscount) {
        this.subtotalDiscount = subtotalDiscount;
    }

    public Double getPaymentSurcharge() {
        return paymentSurcharge;
    }

    public void setPaymentSurcharge(Double paymentSurcharge) {
        this.paymentSurcharge = paymentSurcharge;
    }

    public String getShippingIds() {
        return shippingIds;
    }

    public void setShippingIds(String shippingIds) {
        this.shippingIds = shippingIds;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBFirstname() {
        return bFirstname;
    }

    public void setBFirstname(String bFirstname) {
        this.bFirstname = bFirstname;
    }

    public String getBLastname() {
        return bLastname;
    }

    public void setBLastname(String bLastname) {
        this.bLastname = bLastname;
    }

    public String getBAddress() {
        return bAddress;
    }

    public void setBAddress(String bAddress) {
        this.bAddress = bAddress;
    }

    public String getBAddress2() {
        return bAddress2;
    }

    public void setBAddress2(String bAddress2) {
        this.bAddress2 = bAddress2;
    }

    public String getBCity() {
        return bCity;
    }

    public void setBCity(String bCity) {
        this.bCity = bCity;
    }

    public String getBCounty() {
        return bCounty;
    }

    public void setBCounty(String bCounty) {
        this.bCounty = bCounty;
    }

    public String getBState() {
        return bState;
    }

    public void setBState(String bState) {
        this.bState = bState;
    }

    public String getBCountry() {
        return bCountry;
    }

    public void setBCountry(String bCountry) {
        this.bCountry = bCountry;
    }

    public String getBZipcode() {
        return bZipcode;
    }

    public void setBZipcode(String bZipcode) {
        this.bZipcode = bZipcode;
    }

    public String getBPhone() {
        return bPhone;
    }

    public void setBPhone(String bPhone) {
        this.bPhone = bPhone;
    }

    public String getSFirstname() {
        return sFirstname;
    }

    public void setSFirstname(String sFirstname) {
        this.sFirstname = sFirstname;
    }

    public String getSLastname() {
        return sLastname;
    }

    public void setSLastname(String sLastname) {
        this.sLastname = sLastname;
    }

    public String getSAddress() {
        return sAddress;
    }

    public void setSAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public String getSAddress2() {
        return sAddress2;
    }

    public void setSAddress2(String sAddress2) {
        this.sAddress2 = sAddress2;
    }

    public String getSCity() {
        return sCity;
    }

    public void setSCity(String sCity) {
        this.sCity = sCity;
    }

    public String getSCounty() {
        return sCounty;
    }

    public void setSCounty(String sCounty) {
        this.sCounty = sCounty;
    }

    public String getSState() {
        return sState;
    }

    public void setSState(String sState) {
        this.sState = sState;
    }

    public String getSCountry() {
        return sCountry;
    }

    public void setSCountry(String sCountry) {
        this.sCountry = sCountry;
    }

    public String getSZipcode() {
        return sZipcode;
    }

    public void setSZipcode(String sZipcode) {
        this.sZipcode = sZipcode;
    }

    public String getSPhone() {
        return sPhone;
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getSAddressType() {
        return sAddressType;
    }

    public void setSAddressType(String sAddressType) {
        this.sAddressType = sAddressType;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public String getTaxExempt() {
        return taxExempt;
    }

    public void setTaxExempt(String taxExempt) {
        this.taxExempt = taxExempt;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Long getRepaid() {
        return repaid;
    }

    public void setRepaid(Long repaid) {
        this.repaid = repaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDTO)) {
            return false;
        }
        OrderDTO other = (OrderDTO) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

}
