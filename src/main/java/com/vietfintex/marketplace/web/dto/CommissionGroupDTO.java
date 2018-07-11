package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CommissionGroupDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long commissionGroupId;
    private Long groupId;
    private int level;
    private Long productId;
    private Long storeCategoryId;
    private Double commission;

    public Long getCommissionGroupId() {
        return commissionGroupId;
    }

    public void setCommissionGroupId(Long commissionGroupId) {
        this.commissionGroupId = commissionGroupId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(Long storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }
}
