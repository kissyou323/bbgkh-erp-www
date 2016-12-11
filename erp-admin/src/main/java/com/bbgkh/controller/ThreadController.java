package com.bbgkh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lixiang on 9/7/2016.
 */
@Controller
@RequestMapping("/thread")
public class ThreadController {

    private int a =0;

    @RequestMapping("/setA")
    @ResponseBody
    public void setA(){
        System.out.println(a);
        a=3;
        System.out.println(a);
    }

    @RequestMapping("/getA")
    @ResponseBody
    public void getA(){
        System.out.println(a);
    }

}
