/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vietfintex.marketplace.web.dto;

import java.io.Serializable;

public class OrderDetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long itemId;
    private Long orderId;
    private Long productId;
    private String productCode;
    private Double price;
    private Long amount;
    private byte[] extra;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(Long itemId) {
        this.itemId = itemId;
    }

    public OrderDetailDTO(Long itemId, Long orderId, Long productId, String productCode, Double price, Long amount, byte[] extra) {
        this.itemId = itemId;
        this.orderId = orderId;
        this.productId = productId;
        this.productCode = productCode;
        this.price = price;
        this.amount = amount;
        this.extra = extra;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public byte[] getExtra() {
        return extra;
    }

    public void setExtra(byte[] extra) {
        this.extra = extra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrderDetailDTO)) {
            return false;
        }
        OrderDetailDTO other = (OrderDetailDTO) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

}
