package com.bbgkh.controller.report;

import com.alibaba.fastjson.JSON;
import com.bbgkh.controller.BaseController;
import com.bbgkh.dao.IHomeDao;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.IHomeService;
import com.bbgkh.service.IReportService;
import com.bbgkh.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.bbgkh.controller.BaseConfig.CHARSET;

/**
 * Created by lixiang on 12/16/2016.
 */
@Controller
public class ReportController extends BaseController{
    @Autowired
    private IReportService reportService;

    @RequestMapping(value = "report/todayReport")
    public String newSalePage(HttpServletRequest request, HttpServletResponse response){

        BaseInfo baseInfo = null;
        Map<String , Object> map = new HashMap<>();
        String uid =UserUtils.getUid(request);
        if (uid.equals("")) {
            baseInfo = new BaseInfo("100","请先登录");
            return JSON.toJSONString(baseInfo);
        }
        List<SaleInfoPO> infoPos = reportService.selectById(uid);
        map.put("infoPos",infoPos);

        return null;
    }

    @RequestMapping(value = "report/getReport/{timeStamp}",produces = {CHARSET})
    @ResponseBody
    public String newSalePage(@PathVariable String timeStamp, HttpServletRequest request, HttpServletResponse response){

        BaseInfo baseInfo;
        String uid = UserUtils.getUid(request);

        try {
            baseInfo = reportService.selectByDay(uid,timeStamp);
        } catch (Exception e) {
            logger.error("查询某一天数据出错，timestamp="+timeStamp,e);
            baseInfo = new BaseInfo("300","查询数据库失败");
        }

        return JSON.toJSONString(baseInfo);
    }
}
