package com.bbgkh.controller.sale;

import com.bbgkh.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lixiang on 14/12/2016.
 */
@Controller
public class SaleController extends BaseController{
    @RequestMapping(value = "sale/newSalePage")
    public ModelAndView newSale(HttpServletRequest request, HttpServletResponse response){




        return new ModelAndView("sale/newSale");
    }
}
