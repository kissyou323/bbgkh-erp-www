package com.bbgkh.controller;

import com.bbgkh.model.PO.ProductInfoPO;
import com.bbgkh.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lixiang on 12/13/2016.
 */

@Controller
public class HomeController extends BaseController{

    @Autowired
    private IHomeService homeService;

    @RequestMapping(value = "/")
    @ResponseBody
    public ModelAndView homePage(HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
    @RequestMapping(value = "home/mainDash")
    @ResponseBody
    public ModelAndView getMainPage(HttpServletRequest request){
        List<ProductInfoPO> poList = homeService.selectAll();
        ModelAndView modelAndView = new ModelAndView("dashBoard/mainBoard");
        return modelAndView;
    }
}
