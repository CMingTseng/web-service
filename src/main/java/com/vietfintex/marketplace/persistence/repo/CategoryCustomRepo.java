package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.web.dto.CategoryDTO;

import java.util.List;

public interface CategoryCustomRepo {
    List<CategoryDTO> getAllCategory();
    List<Category> searchCategory(String searchKey, int page);
    List<CategoryDTO> getListStoreCategory(Long storeCategoryId, Long storeId, Long categoryId, String keySearch, int page);
}
