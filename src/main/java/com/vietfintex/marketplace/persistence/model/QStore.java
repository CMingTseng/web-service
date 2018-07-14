//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.vietfintex.marketplace.persistence.model;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.PathMetadataFactory;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;

public class QStore extends EntityPathBase<Store> {
    private static final long serialVersionUID = 22609351L;
    public static final QStore store = new QStore("store");
    public final StringPath address = this.createString("address");
    public final StringPath companyId = this.createString("companyId");
    public final StringPath email = this.createString("email");
    public final NumberPath<Double> latitude = this.createNumber("latitude", Double.class);
    public final NumberPath<Double> longitude = this.createNumber("longitude", Double.class);
    public final NumberPath<Long> ownerId = this.createNumber("ownerId", Long.class);
    public final StringPath phoneNumber = this.createString("phoneNumber");
    public final StringPath status = this.createString("status");
    public final StringPath storeDescription = this.createString("storeDescription");
    public final NumberPath<Long> storeId = this.createNumber("storeId", Long.class);
    public final StringPath storeName = this.createString("storeName");
    public final StringPath website = this.createString("website");

    public QStore(String variable) {
        super(Store.class, PathMetadataFactory.forVariable(variable));
    }

    public QStore(Path<? extends Store> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStore(PathMetadata metadata) {
        super(Store.class, metadata);
    }
}
