package com.bbgkh.controller.report;

import com.bbgkh.controller.BaseController;
import com.bbgkh.dao.IHomeDao;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lixiang on 12/16/2016.
 */
@Controller
public class ReportController extends BaseController{
    @Autowired
    private IHomeService homeService;

    @RequestMapping(value = "report/todayReport")
    public ModelAndView newSalePage(HttpServletRequest request, HttpServletResponse response){

        Map<String , Object> map = new HashMap<>();
        List<SaleInfoPO> infoPos = homeService.selectAll();
        map.put("infoPos",infoPos);

        return new ModelAndView("report/todayReport",map);
    }
}
