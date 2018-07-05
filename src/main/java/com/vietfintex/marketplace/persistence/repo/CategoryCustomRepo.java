package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Category;

import java.util.List;

public interface CategoryCustomRepo {
    List<Category> searchCategory(String searchKey, int page);
    List<Category> getListStoreCategory(Long storeCategoryId, Long storeId, Long categoryId, String keySearch, int page);
}
