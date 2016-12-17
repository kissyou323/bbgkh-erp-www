package com.bbgkh.controller.report;

import com.bbgkh.controller.BaseController;
import com.bbgkh.dao.IHomeDao;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.IHomeService;
import com.bbgkh.service.IReportService;
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
    private IReportService reportService;

    @RequestMapping(value = "report/todayReport")
    public ModelAndView newSalePage(HttpServletRequest request, HttpServletResponse response){

        Map<String , Object> map = new HashMap<>();
        String uid =((CustomerPO)request.getSession().getAttribute("customer")).getUid();
        List<SaleInfoPO> infoPos = reportService.selectById(uid);
        map.put("infoPos",infoPos);

        return new ModelAndView("report/todayReport",map);
    }
}
