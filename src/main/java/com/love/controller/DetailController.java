package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lixiang on 2016/7/17.
 */
@Controller
@RequestMapping("/detail")
public class DetailController extends BaseController{

    @RequestMapping("")
    @ResponseBody
    public ModelAndView deteail(){
        return new ModelAndView("addDetail");
    }
}
