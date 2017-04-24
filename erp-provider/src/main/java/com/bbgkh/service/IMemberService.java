package com.bbgkh.service;

import com.bbgkh.model.BaseInfo;
import com.bbgkh.utils.BBLogger;

/**
 * Created by lixiang01 on 2/6/2017.
 */
public interface IMemberService {

    BBLogger logger = BBLogger.getLogger(IMemberService.class);

    public BaseInfo addMemberInfo(Object entity);
}
