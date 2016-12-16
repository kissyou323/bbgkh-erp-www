package com.bbgkh.utils;

/**
 * Created by lixiang on 16/12/2016.
 */
public class StringUtils {
    public static String getUID(String name){
        StringBuffer sb = new StringBuffer();
        for (char c : name.toCharArray()) {
            byte b = (byte)c;
            sb.append(b);
        }
        return sb.toString();
    }
}
