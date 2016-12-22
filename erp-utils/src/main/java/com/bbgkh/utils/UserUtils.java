package com.bbgkh.utils;

import com.bbgkh.model.PO.CustomerPO;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lixiang on 12/19/2016.
 */
public class UserUtils {
    private static final BBLogger logger = BBLogger.getLogger(UserUtils.class);
    public static String getUid(HttpServletRequest request){

       String uid=CookieUtils.getCookieValue(request, "uid").trim();
        if (uid.equals("")) {
            uid =((CustomerPO)request.getSession().getAttribute("customer")).getUid();
            if (uid.trim().equals("")) {
                logger.error("UserUtils中获取uid为空");
            }
        }
        return uid;
    }
}
