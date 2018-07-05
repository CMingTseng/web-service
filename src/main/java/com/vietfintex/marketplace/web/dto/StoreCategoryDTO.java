package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StoreCategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long storeCategoryId;
    private Long storeId;
    private Long categoryId;
    private String status;

    public Long getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(Long storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
