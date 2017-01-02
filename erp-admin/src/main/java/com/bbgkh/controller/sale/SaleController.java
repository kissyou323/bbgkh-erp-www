package com.bbgkh.controller.sale;

import com.bbgkh.controller.BaseController;
import com.bbgkh.model.DTO.SaleInfoDTO;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.ISaleService;
import com.bbgkh.utils.UserUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        SaleInfoPO saleInfoPO = new SaleInfoPO();
        BeanUtils.copyProperties(saleInfoDTO,saleInfoPO);
        String uid = UserUtils.getUid(request);
        saleInfoPO.setUid(uid);
        int a  = 3;
        try {
           a= saleService.insert(saleInfoPO);
        } catch (Exception e) {
            logger.error("插入销售数据失败",e);
        }

        if(a!=1){
            returnStr="fail";
        }
        return returnStr;
    }
    @RequestMapping(value = "sale/modifySaleInfo" ,method = RequestMethod.POST)
    @ResponseBody
    public String modifySaleInfo(SaleInfoDTO saleInfoDTO, HttpServletRequest request, HttpServletResponse response){
        String returnStr = "ok";
        SaleInfoPO saleInfoPO = new SaleInfoPO();
        BeanUtils.copyProperties(saleInfoDTO,saleInfoPO);
        String uid = UserUtils.getUid(request);
        saleInfoPO.setUid(uid);
        int a  = 3;
        try {
           a= saleService.update(saleInfoPO);
        } catch (Exception e) {
            logger.error("更新销售数据失败",e);
        }

        if(a!=1){
            returnStr="fail";
        }
        return returnStr;
    }
}
