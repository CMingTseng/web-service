package com.vietfintex.marketplace.util;

import java.util.Collection;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class DataUtil {
    public static <T> boolean nonNullOrEmpty(Collection<T> collection) {
        return nonNull(collection) && !collection.isEmpty();
    }

    public static <T> boolean nullOrEmpty(Collection<T> collection) {
        return isNull(collection) || collection.isEmpty();
    }
}
