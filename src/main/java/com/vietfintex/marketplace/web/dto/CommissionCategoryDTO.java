package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CommissionCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long commissionCategoryId;
    private long storeCategoryId;
    private long groupRootId;
    private int groupLevel;
    private Double commission;
    private String status;

    public Long getCommissionCategoryId() {
        return commissionCategoryId;
    }

    public void setCommissionCategoryId(Long commissionCategoryId) {
        this.commissionCategoryId = commissionCategoryId;
    }

    public long getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(long storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public long getGroupRootId() {
        return groupRootId;
    }

    public void setGroupRootId(long groupRootId) {
        this.groupRootId = groupRootId;
    }

    public int getGroupLevel() {
        return groupLevel;
    }

    public void setGroupLevel(int groupLevel) {
        this.groupLevel = groupLevel;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
