package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.StoreCategory;
import com.vietfintex.marketplace.web.dto.StoreCategoryDTO;
import com.vietfintex.marketplace.web.dto.StoreCategoryWrapDTO;

import java.util.List;

public interface StoreCategoryService extends IOperations<StoreCategory,StoreCategoryDTO> {
    StoreCategoryDTO modifyStoreCategory(StoreCategoryDTO storeCategoryWrap, String action);
}
