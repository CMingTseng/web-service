package com.vietfintex.marketplace.util;

public class GlobalUtil {
    static public boolean isNullOrEmpty(String input){
        if(input == null || "".equals(input)){
            return true;
        }
        return false;
    }
}
