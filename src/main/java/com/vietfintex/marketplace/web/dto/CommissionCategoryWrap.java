package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CommissionCategoryWrap implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<CommissionGroupDTO> data;

    public List<CommissionGroupDTO> getData() {
        return data;
    }

    public void setData(List<CommissionGroupDTO> data) {
        this.data = data;
    }
}
