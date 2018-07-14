package com.vietfintex.marketplace.persistence.model;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.PathMetadataFactory;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

import java.util.Date;

public class QProduct extends EntityPathBase<Product> {
    public static final QProduct product = new QProduct("product");
    private static final long serialVersionUID = 1827549269L;
    public final NumberPath<Long> amount = this.createNumber("amount", Long.class);
    public final StringPath approved = this.createString("approved");
    public final DateTimePath<Date> availSince = this.createDateTime("availSince", Date.class);
    public final NumberPath<Long> categoryId = this.createNumber("categoryId", Long.class);
    public final DateTimePath<Date> createTime = this.createDateTime("createTime", Date.class);
    public final StringPath freeShipping = this.createString("freeShipping");
    public final StringPath fullDescription = this.createString("fullDescription");
    public final NumberPath<Long> height = this.createNumber("height", Long.class);
    public final StringPath isReturnable = this.createString("isReturnable");
    public final NumberPath<Long> length = this.createNumber("length", Long.class);
    public final NumberPath<Double> listPrice = this.createNumber("listPrice", Double.class);
    public final NumberPath<Long> lowAvailLimit = this.createNumber("lowAvailLimit", Long.class);
    public final NumberPath<Long> parentProductId = this.createNumber("parentProductId", Long.class);
    public final StringPath productCode = this.createString("productCode");
    public final NumberPath<Long> productId = this.createNumber("productId", Long.class);
    public final StringPath productName = this.createString("productName");
    public final StringPath productType = this.createString("productType");
    public final StringPath promoText = this.createString("promoText");
    public final NumberPath<Long> returnPeriod = this.createNumber("returnPeriod", Long.class);
    public final NumberPath<Double> shippingFreight = this.createNumber("shippingFreight", Double.class);
    public final StringPath shortDescription = this.createString("shortDescription");
    public final StringPath status = this.createString("status");
    public final NumberPath<Long> storeId = this.createNumber("storeId", Long.class);
    public final DateTimePath<Date> updatedTime = this.createDateTime("updatedTime", Date.class);
    public final StringPath variationCode = this.createString("variationCode");
    public final StringPath variationOption = this.createString("variationOption");
    public final NumberPath<Double> weight = this.createNumber("weight", Double.class);
    public final NumberPath<Long> width = this.createNumber("width", Long.class);

    public QProduct(String variable) {
        super(Product.class, PathMetadataFactory.forVariable(variable));
    }

    public QProduct(Path<? extends Product> path) {
        super(path.getType(), path.getMetadata());
    }

    public QProduct(PathMetadata metadata) {
        super(Product.class, metadata);
    }
}
