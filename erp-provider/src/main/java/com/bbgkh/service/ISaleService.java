package com.bbgkh.service;

import com.bbgkh.model.BaseInfo;
import com.bbgkh.service.BaseService;

/**
 * Created by lixiang on 14/12/2016.
 */
public interface ISaleService extends BaseService {
    BaseInfo deleteById(String id);
}
