package com.vietfintex.marketplace.web.service;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.web.dto.CategoryDTO;

import java.util.List;

public interface CategoryService extends IOperations<Category,CategoryDTO> {
    List<CategoryDTO> getCategoryList();
    List<CategoryDTO> searchCategory(String searchKey, int page);
    List<CategoryDTO> getListStoreCategory(Long storeCategoryId, Long storeId, Long categoryId, String keySearch, int page);
}
