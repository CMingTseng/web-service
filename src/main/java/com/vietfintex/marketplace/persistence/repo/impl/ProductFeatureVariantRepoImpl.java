package com.vietfintex.marketplace.persistence.repo.impl;

import com.vietfintex.marketplace.persistence.repo.ProductFeatureVariantCustomRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ProductFeatureVariantRepoImpl implements ProductFeatureVariantCustomRepo {
    @PersistenceContext
    private EntityManager em;

}
