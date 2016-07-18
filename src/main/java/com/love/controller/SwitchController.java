package com.love.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lixiang on 2016/7/18.
 */
@Controller
@RequestMapping("switch")
public class SwitchController {

    @RequestMapping(value = "home/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView homePage(@PathVariable String name){
        ModelAndView modelAndView = new ModelAndView();
        if(name.equals("yongsamas")){
            modelAndView.addObject("memberId","1");
            modelAndView.setViewName("homePage");
            return modelAndView;
        }else if(name.equals("lixiang")){
            modelAndView.addObject("memberId","2");
            modelAndView.setViewName("homePage");
            return modelAndView;
        }
        return null;
    }
}
