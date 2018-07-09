package com.vietfintex.marketplace.persistence.repo;
import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.StoreCategory;

import java.util.List;

public interface StoreCategoryCustomRepo {
    void storeCategoryChange(long storeId, List<Long> categoryIdList);
}
