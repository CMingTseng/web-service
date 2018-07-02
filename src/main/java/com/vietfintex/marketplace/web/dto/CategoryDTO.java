package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long categoryId;
    private String categoryName;
    private String categoryDescription;
    private Long timestamp;
    private String isTrash;
    private String status;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getIsTrash() {
        return isTrash;
    }

    public void setIsTrash(String isTrash) {
        this.isTrash = isTrash;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
