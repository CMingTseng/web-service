package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StoreWrapDTO  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long userLoginId;
    private StoreDTO storeDTO;
    private Integer page;

    public Long getUserLoginId() {
        return userLoginId;
    }

    public void setUserLoginId(Long userLoginId) {
        this.userLoginId = userLoginId;
    }

    public StoreDTO getStoreDTO() {
        return storeDTO;
    }

    public void setStoreDTO(StoreDTO storeDTO) {
        this.storeDTO = storeDTO;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
