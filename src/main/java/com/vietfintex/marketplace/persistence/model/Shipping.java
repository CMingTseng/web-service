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
@Table(name = "shipping")
public class Shipping implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shipping_id")
    private Long shippingId;
    @Basic(optional = false)
    @Column(name = "shipping")
    private String shipping;
    @Basic(optional = false)
    @Column(name = "delivery_time")
    private String deliveryTime;
    @Lob
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @Column(name = "store_id")
    private Long storeId;
    @Basic(optional = false)
    @Column(name = "destination")
    private String destination;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "min_weight")
    private Double minWeight;
    @Basic(optional = false)
    @Column(name = "max_weight")
    private Double maxWeight;
    @Basic(optional = false)
    @Column(name = "rate_calculation")
    private String rateCalculation;
    @Basic(optional = false)
    @Column(name = "service_id")
    private Long serviceId;
    @Lob
    @Column(name = "service_params")
    private String serviceParams;
    @Basic(optional = false)
    @Column(name = "tax_ids")
    private String taxIds;
    @Basic(optional = false)
    @Column(name = "position")
    private short position;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Column(name = "free_shipping")
    private String freeShipping;
    @Basic(optional = false)
    @Column(name = "disable_payment_ids")
    private String disablePaymentIds;

    public Shipping() {
    }

    public Shipping(Long shippingId) {
        this.shippingId = shippingId;
    }

    public Shipping(Long shippingId, String shipping, String deliveryTime, Long storeId, String destination, Double minWeight, Double maxWeight, String rateCalculation, Long serviceId, String taxIds, short position, String status, String freeShipping, String disablePaymentIds) {
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
        if (!(object instanceof Shipping)) {
            return false;
        }
        Shipping other = (Shipping) object;
        if ((this.shippingId == null && other.shippingId != null) || (this.shippingId != null && !this.shippingId.equals(other.shippingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.Shipping[ shippingId=" + shippingId + " ]";
    }
    
}
