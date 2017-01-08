package com.bbgkh.service;

import com.bbgkh.model.BaseInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by lixiang on 12/17/2016.
 */
public interface IReportService extends BaseService {
    //查询某一天的销售情况
    BaseInfo selectByDay(String uid, String timeStamp);
}
