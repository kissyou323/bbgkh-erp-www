package com.bbgkh.service.impl;


import com.bbgkh.dao.IUserDao;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.IUserService;
import com.bbgkh.utils.BBLogger;
import com.bbgkh.utils.MD5Utils;
import com.bbgkh.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by lixiang on 12/16/2016.
 */
@Service
public class IUserServiceImpl implements IUserService {

    private BBLogger logger = BBLogger.getLogger(this.getClass());

    @Autowired
    private IUserDao userDao;

    @Override
    public BaseInfo insert(Object entity) {
        //将用户名转换成UID
        CustomerPO customerPO = (CustomerPO) entity;
        StringBuffer sb = new StringBuffer();
        for (char c : customerPO.getName().toCharArray()) {
            byte b = (byte)c;
            sb.append(b);
        }
        customerPO.setUid(sb.toString());
        //取用户密码进行MD5加密
        String oldPassword = customerPO.getPassword();

        String newPassword = null;
        if(!oldPassword.trim().equals(""))
              newPassword= MD5Utils.getMd5(oldPassword);

        customerPO.setPassword(newPassword);
        int a =-1;
        try {
           a= userDao.insert(customerPO);
        } catch (Exception e) {
            logger.error("注册失败："+customerPO.getName(),e);
        }


        return null;
    }

    @Override
    public List selectAll() {
        return null;
    }

    @Override
    public BaseInfo selectById(String uid) {
        List<CustomerPO> customerPOS = userDao.selectById(uid);
        BaseInfo baseInfo = new BaseInfo();
        baseInfo.setObject(customerPOS);
        return baseInfo;
    }

    @Override
    public BaseInfo update(Object entity) {
        return null;
    }

    @Override
    public List<CustomerPO> validateUser(String name,String oldPassword) {
        String newName = StringUtils.getUID(name);
        if(oldPassword.trim().equals("")){
            return new ArrayList<CustomerPO>();
        }
        String newPassword =MD5Utils.getMd5(oldPassword);
        return userDao.validateUser(newName,newPassword);
    }

    @Override
    public List<CustomerPO> validateName(String uid) {
        String newName = StringUtils.getUID(uid);
        return userDao.validateUser(newName,"");
    }

    @Override
    public CustomerPO findUserByUsername(String username) {

        return userDao.findUserByUsername(username);
    }

    @Override
    public Set<String> findRoles(String username) {
        return userDao.findRoles(username);
    }

    @Override
    public Set<String> findPermissions(String username) {
        return userDao.findPermissions(username);
    }
}
