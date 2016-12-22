package com.bbgkh.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lixiang on 12/17/2016.
 */
@Repository
public interface IReportDao extends BaseDAO {
    List selectByDay(@Param("uid") String uid, @Param("timeStamp")  String timeStamp);
}
