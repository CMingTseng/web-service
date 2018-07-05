package com.vietfintex.marketplace.web.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StoreCategoryWrapDTO  implements Serializable {
    private static final long serialVersionUID = 1L;

    private int page;
    private String searchKey;
    private String action;  //InsertOrUpdate M ; D: delete
    private StoreCategoryDTO storeCategoryDTO;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getKeySearch() {
        return searchKey;
    }

    public void setKeySearch(String keySearch) {
        this.searchKey = keySearch;
    }

    public StoreCategoryDTO getStoreCategoryDTO() {
        return storeCategoryDTO;
    }

    public void setStoreCategoryDTO(StoreCategoryDTO storeCategoryDTO) {
        this.storeCategoryDTO = storeCategoryDTO;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
