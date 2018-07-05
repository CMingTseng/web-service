package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.model.Category;
import com.vietfintex.marketplace.persistence.model.StoreCategory;
import com.vietfintex.marketplace.persistence.repo.StoreCategoryCustomRepo;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StoreCategoryCustomRepoImpl implements StoreCategoryCustomRepo {
    @PersistenceContext
    private EntityManager em;

}
