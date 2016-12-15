package com.bbgkh.controller.sale;

import com.bbgkh.controller.BaseController;
import com.bbgkh.model.DTO.SaleInfoDTO;
import com.bbgkh.service.sale.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lixiang on 14/12/2016.
 */
@Controller
public class SaleController extends BaseController{

    @Autowired
    private ISaleService saleService;

    @RequestMapping(value = "sale/newSalePage")
    public ModelAndView newSalePage(HttpServletRequest request, HttpServletResponse response){

        return new ModelAndView("sale/newSale");
    }
    @RequestMapping(value = "sale/newSaleInfo" ,method = RequestMethod.POST)
    @ResponseBody
    public String newSaleInfo(SaleInfoDTO saleInfoDTO, HttpServletRequest request, HttpServletResponse response){
        String returnStr = "ok";
        int a  = saleService.insert(saleInfoDTO);
        if(a!=1){
            returnStr="fail";
        }
        return returnStr;
    }
}
