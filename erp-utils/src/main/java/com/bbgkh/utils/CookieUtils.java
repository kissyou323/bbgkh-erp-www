package com.bbgkh.utils;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lixiang on 17/12/2016.
 */
public class CookieUtils {

    public static String getCookieValue(HttpServletRequest request,String cookieName){
        String cookieValue ="";
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {

                if (cookie.getName().equals(cookieName)) {
                    cookieValue = cookie.getValue();

                }
            }
        }
        return cookieValue;
    }
}
