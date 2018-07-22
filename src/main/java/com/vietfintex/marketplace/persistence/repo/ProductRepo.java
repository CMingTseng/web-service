package com.vietfintex.marketplace.persistence.repo;

import com.querydsl.core.types.dsl.StringPath;
import com.vietfintex.marketplace.persistence.model.Product;
import com.vietfintex.marketplace.persistence.model.QProduct;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public interface ProductRepo extends BaseRepository<Product, QProduct, Long>, ProductCustomRepo{
    @Override
    default void customize(QuerydslBindings bindings, QProduct root) {
        bindings.bind(String.class).first(
                (StringPath path, String value) -> path.containsIgnoreCase(value));

        bindings.including(root.productId, root.productCode, root.productName, root.amount
                , root.approved, root.freeShipping, root.fullDescription, root.shortDescription, root.categoryId);
    }
}
