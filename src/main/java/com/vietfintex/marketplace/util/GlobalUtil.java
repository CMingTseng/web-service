package com.vietfintex.marketplace.util;

import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

import static java.util.Objects.isNull;
import static org.springframework.util.StringUtils.isEmpty;

public class GlobalUtil {
    static public boolean isNullOrEmpty(String input){
        if(input == null || "".equals(input)){
            return true;
        }
        return false;
    }
    public static <T> boolean isEmpty(Collection<T> collection) {
        return isNull(collection) || collection.isEmpty();
    }
    public static boolean isEmpty(String str) {
        return isNull(str) || str.isEmpty();
    }
    public static String requireNonEmpty(String str, String message) {
        if (isEmpty(str))
            throw new NullPointerException(message);
        return str;
    }
    public static <T> Collection<T> requireNonEmpty(Collection<T> collection, String message) {
        if (isNull(collection) || collection.isEmpty())
            throw new NullPointerException(message);
        return collection;
    }
}
