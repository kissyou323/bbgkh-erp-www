package com.bbgkh.utils;

import com.bbgkh.model.PO.CustomerPO;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lixiang on 12/19/2016.
 */
public class UserUtils {
    public static String getUid(HttpServletRequest request){
        String uid ="";
        if (CookieUtils.getCookieValue(request, "uid").trim() .equals("")) {
            uid =((CustomerPO)request.getSession().getAttribute("customer")).getUid();
        }

        return uid;
    }
}
