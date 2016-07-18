package com.love.controller;

import com.love.model.Detail;
import com.love.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lixiang on 2016/7/17.
 */
@Controller
@RequestMapping("/detail")
public class DetailController extends BaseController{

    @Autowired
    private DetailService detailService;

    @RequestMapping("")
    @ResponseBody
    public ModelAndView deteail(){
        ModelAndView modelAndView = new ModelAndView("detail");
        List<Detail> details = detailService.selectAll();
        modelAndView.addObject("details",details);
        return modelAndView;
    }
}
