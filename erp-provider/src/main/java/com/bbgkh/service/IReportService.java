package com.bbgkh.service;

import java.util.List;

/**
 * Created by lixiang on 12/17/2016.
 */
public interface IReportService extends BaseService {
    //查询某一天的销售情况
    List selectByDay(String uid, String timeStamp);
}
