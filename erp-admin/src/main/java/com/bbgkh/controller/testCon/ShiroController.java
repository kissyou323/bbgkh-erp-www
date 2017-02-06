package com.bbgkh.controller.testCon;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lixiang01 on 2017/1/9.
 */
@Controller
public class ShiroController {

    @RequiresRoles("admin")
    @RequestMapping(value = {"test/shiro"})
    @ResponseBody
    public String testShiro(HttpServletRequest request, HttpServletResponse response){
        Subject subject = SecurityUtils.getSubject();
        if(subject.isAuthenticated()){
            System.out.println("au");
        }else{
            System.out.println("fail");
        }
        System.out.println(subject);
        System.out.println("come in test");
        return null;
    }


}
