package com.bbgkh.controller;

import com.bbgkh.utils.BBLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lixiang on 2016/7/17.
 */
public class BaseController {
    protected BBLogger logger = BBLogger.getLogger(BaseController.class);

    @ModelAttribute
    public void initController(HttpServletRequest request, HttpServletResponse response){
      /*  System.out.println(request.getContextPath());  //   /love
        System.out.println(request.getRequestURI());   //   /love/detail
        System.out.println(request.getRequestURL());   //  http://localhost:8080/love/detail
        */
        String webroot=request.getContextPath();

        request.setAttribute("rsRoot", "/bbgkh/resource/");
        request.setAttribute("webRoot", "/bbgkh");
    }

}
