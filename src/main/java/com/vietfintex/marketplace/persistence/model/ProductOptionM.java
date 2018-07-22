package com.vietfintex.marketplace.persistence.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_option_tb")
public class ProductOptionM  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "product_kind_id")
    private Long productKindId;
    @Column(name = "product_id")
    private Long productId;
    @Column(name = "product_kind_name")
    private String productKindName;
    @Column(name = "product_price")
    private Double productPrice;
    @Column(name = "stock_quanlity")
    private Long stockQuanlity;
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productKindId != null ? productKindId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductOption)) {
            return false;
        }
        ProductOptionM other = (ProductOptionM) object;
        if ((this.productKindId == null && other.productKindId != null) || (this.productKindId != null && !this.productKindId.equals(other.productKindId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vietfintex.marketplace.model.ProductOptionM[ productKindId=" + productKindId + " ]";
    }

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
