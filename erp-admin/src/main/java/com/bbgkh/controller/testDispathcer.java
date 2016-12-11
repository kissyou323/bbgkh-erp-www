package com.bbgkh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by lixiang on 2016/7/26.
 */
@Controller
@RequestMapping(value = "/begin")
public class testDispathcer {


    @RequestMapping(value = "")
    public ModelAndView testDispathcer(){

        System.out.println("hello");
        return new ModelAndView("begin");
    }
}
