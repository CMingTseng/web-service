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
@Table(name = "order_detail")
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "item_id")
    private Long itemId;
    @Basic(optional = false)
    @Column(name = "order_id")
    private Long orderId;
    @Basic(optional = false)
    @Column(name = "product_id")
    private Long productId;
    @Basic(optional = false)
    @Column(name = "product_code")
    private String productCode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "price")
    private Double price;
    @Basic(optional = false)
    @Column(name = "amount")
    private Long amount;
    @Basic(optional = false)
    @Lob
    @Column(name = "extra")
    private byte[] extra;

    public OrderDetail() {
    }

    public OrderDetail(Long itemId) {
        this.itemId = itemId;
    }

    public OrderDetail(Long itemId, Long orderId, Long productId, String productCode, Double price, Long amount, byte[] extra) {
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
        if (!(object instanceof OrderDetail)) {
            return false;
        }
        OrderDetail other = (OrderDetail) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.OrderDetail[ itemId=" + itemId + " ]";
    }
    
}
