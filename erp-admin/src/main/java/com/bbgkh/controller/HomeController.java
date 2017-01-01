package com.bbgkh.controller;

import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.IHomeService;
import com.bbgkh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lixiang on 12/13/2016.
 */

@Controller
public class HomeController extends BaseController{

    @Autowired
    private IHomeService homeService;

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/")
    @ResponseBody
    public ModelAndView homePage(HttpServletRequest request){

        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {

                if (cookie.getName().equals("uid")) {
                    String uid = cookie.getValue();
                    List<CustomerPO> poList = userService.selectById(uid);
                    request.getSession().setAttribute("customer",poList.get(0));
                    return new ModelAndView("dashBoard/mainBoard");
                }
            }
        }


        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
    @RequestMapping(value = "home/mainDash")
    @ResponseBody
    public ModelAndView getMainPage(HttpServletRequest request){



        ModelAndView modelAndView = new ModelAndView("dashBoard/mainBoard");

        return modelAndView;
    }

}
