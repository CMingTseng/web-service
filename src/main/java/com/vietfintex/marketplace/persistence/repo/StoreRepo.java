package com.vietfintex.marketplace.persistence.repo;

import com.querydsl.core.types.dsl.StringPath;
import com.vietfintex.marketplace.persistence.model.QStore;
import com.vietfintex.marketplace.persistence.model.Store;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface StoreRepo extends BaseRepository<Store, QStore,Long>, StoreCustomRepo {
    @Override
    default void customize(QuerydslBindings bindings, QStore root) {
        bindings.bind(String.class).first(
                (StringPath path, String value) -> path.containsIgnoreCase(value));
//        bindings.excluding(root.email);
    }
}
