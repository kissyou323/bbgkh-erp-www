package com.bbgkh.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by lixiang on 12/16/2016.
 */
public class MD5Utils {
    private static BBLogger bbLogger = BBLogger.getLogger(MD5Utils.class);

    public static String getMd5(String source){
        String newStr="";
        MessageDigest mdInst = null;
        try {
            mdInst = MessageDigest.getInstance("MD5");
            BASE64Encoder base64en = new BASE64Encoder();
            //加密后的字符串
            newStr=base64en.encode(mdInst.digest(source.getBytes("utf-8")));
        } catch (Exception e) {
            bbLogger.error("转换MD5加密失败，原密码为："+source,e);
        }

        return newStr;
    }
}
