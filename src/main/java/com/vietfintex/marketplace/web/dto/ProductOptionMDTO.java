package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProductOptionMDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long productKindId;
    private Long productId;
    private String productKindName;
    private Double productPrice;
    private Long stockQuanlity;

    public Long getProductKindId() {
        return productKindId;
    }

    public void setProductKindId(Long productKindId) {
        this.productKindId = productKindId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductKindName() {
        return productKindName;
    }

    public void setProductKindName(String productKindName) {
        this.productKindName = productKindName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Long getStockQuanlity() {
        return stockQuanlity;
    }

    public void setStockQuanlity(Long stockQuanlity) {
        this.stockQuanlity = stockQuanlity;
    }
}
