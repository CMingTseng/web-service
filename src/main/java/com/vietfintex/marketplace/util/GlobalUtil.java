package com.vietfintex.marketplace.util;

import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
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
    public static String sha256(String base) {
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
