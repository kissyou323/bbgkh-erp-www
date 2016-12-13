package com.bbgkh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lixiang on 12/13/2016.
 */

@Controller
public class HomeController extends BaseController{
    @RequestMapping(value = "/")
    @ResponseBody
    public ModelAndView homePage(HttpServletRequest request){

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
