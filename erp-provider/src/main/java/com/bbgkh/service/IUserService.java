package com.bbgkh.service;

import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.BaseService;

import java.util.List;

/**
 * Created by lixiang on 12/16/2016.
 */
public interface IUserService extends BaseService{
    List<CustomerPO> validateUser(String uid);
}
