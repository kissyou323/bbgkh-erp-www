package com.love.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.love.model.Detail;
import com.love.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/{id}")
    @ResponseBody
    public PageInfo<Detail> deteail(@PathVariable int id){

        System.out.println(id);
        PageHelper.startPage(1,10);
        List<Detail> details = detailService.selectAll();
        PageInfo<Detail> page = new PageInfo<>(details);

        return page;
    }
}
