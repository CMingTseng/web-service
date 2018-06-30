package com.vietfintex.marketplace.util;

import static java.util.Objects.isNull;

public class NumberUtils extends org.apache.commons.lang3.math.NumberUtils {
    public static Long convertToLong(Object object){
        return createLong(convertToString(object));
    }
    public static String convertToString(Object object){
        return isNull(object) ? null : String.valueOf(object);
    }
}
