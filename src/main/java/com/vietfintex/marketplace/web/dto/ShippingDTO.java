/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import java.io.Serializable;

public class ShippingDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long shippingId;
    private String shipping;
    private String deliveryTime;
    private String description;
    private Long storeId;
    private String destination;
    private Double minWeight;
    private Double maxWeight;
    private String rateCalculation;
    private Long serviceId;
    private String serviceParams;
    private String taxIds;
    private short position;
    private String status;
    private String freeShipping;
    private String disablePaymentIds;

    public ShippingDTO() {
    }

    public ShippingDTO(Long shippingId) {
        this.shippingId = shippingId;
    }

    public ShippingDTO(Long shippingId, String shipping, String deliveryTime, Long storeId, String destination, Double minWeight, Double maxWeight, String rateCalculation, Long serviceId, String taxIds, short position, String status, String freeShipping, String disablePaymentIds) {
        this.shippingId = shippingId;
        this.shipping = shipping;
        this.deliveryTime = deliveryTime;
        this.storeId = storeId;
        this.destination = destination;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.rateCalculation = rateCalculation;
        this.serviceId = serviceId;
        this.taxIds = taxIds;
        this.position = position;
        this.status = status;
        this.freeShipping = freeShipping;
        this.disablePaymentIds = disablePaymentIds;
    }

    public Long getShippingId() {
        return shippingId;
    }

    public void setShippingId(Long shippingId) {
        this.shippingId = shippingId;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Double minWeight) {
        this.minWeight = minWeight;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getRateCalculation() {
        return rateCalculation;
    }

    public void setRateCalculation(String rateCalculation) {
        this.rateCalculation = rateCalculation;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceParams() {
        return serviceParams;
    }

    public void setServiceParams(String serviceParams) {
        this.serviceParams = serviceParams;
    }

    public String getTaxIds() {
        return taxIds;
    }

    public void setTaxIds(String taxIds) {
        this.taxIds = taxIds;
    }

    public short getPosition() {
        return position;
    }

    public void setPosition(short position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(String freeShipping) {
        this.freeShipping = freeShipping;
    }

    public String getDisablePaymentIds() {
        return disablePaymentIds;
    }

    public void setDisablePaymentIds(String disablePaymentIds) {
        this.disablePaymentIds = disablePaymentIds;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (shippingId != null ? shippingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShippingDTO)) {
            return false;
        }
        ShippingDTO other = (ShippingDTO) object;
        if ((this.shippingId == null && other.shippingId != null) || (this.shippingId != null && !this.shippingId.equals(other.shippingId))) {
            return false;
        }
        return true;
    }

}
