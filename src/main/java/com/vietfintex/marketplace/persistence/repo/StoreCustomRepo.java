package com.vietfintex.marketplace.persistence.repo;

import com.vietfintex.marketplace.persistence.model.Store;

import java.util.List;

public interface StoreCustomRepo {
    List<Store> getStoreList(Long storeId, Long ownerId, String storeName, String address,Integer page, Double lat, Double lon);
}
