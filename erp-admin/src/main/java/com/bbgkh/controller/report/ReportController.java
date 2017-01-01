package com.bbgkh.controller.report;

import com.bbgkh.controller.BaseController;
import com.bbgkh.dao.IHomeDao;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.IHomeService;
import com.bbgkh.service.IReportService;
import com.bbgkh.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
        String uid =UserUtils.getUid(request);
        if (uid.equals("")) {
            return new ModelAndView("redirect:/");
        }
        List<SaleInfoPO> infoPos = reportService.selectById(uid);
        map.put("infoPos",infoPos);

        return new ModelAndView("report/todayReport",map);
    }

    @RequestMapping(value = "report/getReport/{timeStamp}")
    public ModelAndView newSalePage(@PathVariable String timeStamp, HttpServletRequest request, HttpServletResponse response){

        Map<String , Object> map = new HashMap<>();
        String uid = UserUtils.getUid(request);
        List<SaleInfoPO> infoPos = null;
        try {
            infoPos = reportService.selectByDay(uid,timeStamp);
        } catch (Exception e) {
            logger.error("查询某一天数据出错，timestamp="+timeStamp,e);
        }
        map.put("infoPos",infoPos);

        return new ModelAndView("report/reportData",map);
    }
}
