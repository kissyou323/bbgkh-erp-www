package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lixiang on 2016/7/16.
 */
@Controller
public class studyRest {

    @RequestMapping(value = "testHttpClient")
    @ResponseBody
    public String testHttpClient(){
        return "test";
    }
}
