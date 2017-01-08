package com.bbgkh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lixiang on 07/01/2017.
 */
@Controller
public class CommonController extends BaseController{
    @RequestMapping(value = {"showPage/{pageName}"})
    @ResponseBody
    public ModelAndView showPage(@PathVariable String pageName ){
        String[] pages = pageName.split("-");
        String page="";
        for (int i = 0; i < pages.length; i++) {
            page+=pages[i];
            if(i<pages.length-1){
                page+="/";
            }
        }
        return new ModelAndView(page);
    }
}
