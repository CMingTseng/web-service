package com.vietfintex.marketplace.util;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class ObjectMapper<K, V> {
    private final static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    public ObjectMapper(){
    }

}
