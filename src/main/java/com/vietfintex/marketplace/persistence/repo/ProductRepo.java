package com.vietfintex.marketplace.persistence.repo;

import com.querydsl.core.types.dsl.StringPath;
import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.persistence.model.QProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface ProductRepo extends JpaRepository<Product, Long>, ProductCustomRepo, QuerydslPredicateExecutor<Product>, QuerydslBinderCustomizer<QProduct> {
    @Override
    default void customize(QuerydslBindings bindings, QProduct root) {
        bindings.bind(String.class).first(
                (StringPath path, String value) -> path.containsIgnoreCase(value));
//        bindings.excluding(root.email);
    }
}
