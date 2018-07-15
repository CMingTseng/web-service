package com.vietfintex.marketplace.web.service;

import com.querydsl.core.types.Predicate;
import com.vietfintex.marketplace.persistence.model.Store;
import com.vietfintex.marketplace.web.dto.StoreDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StoreService extends IOperations<Store, StoreDTO> {
    List<StoreDTO> getStoreList(Long storeId, Long ownerId, String storeName, String address, Integer page);
    StoreDTO insertOrUpdateStore(StoreDTO storeDTO);
    void deleteStore(StoreDTO storeDTO);
    Iterable<StoreDTO> findAll(Predicate predicate, Pageable pageable);
}
