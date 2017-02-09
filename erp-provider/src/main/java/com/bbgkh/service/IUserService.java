package com.bbgkh.service;

import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.BaseService;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by lixiang on 12/16/2016.
 */
public interface IUserService extends BaseService{
    List<CustomerPO> validateUser(String uid,String password);

    List<CustomerPO> validateName(String uid);

    /**
     * Shiro的登录验证，通过用户名查询用户信息
     * @param username
     * @return
     */
    public CustomerPO findUserByUsername(String username) ;

    /**
     * 根据账号查找角色名称
     * @param username
     * @return
     */
    public Set<String> findRoles(String username) ;

    /**
     * 根据账号查找权限
     * @param username
     * @return
     */
    public Set<String> findPermissions(String username) ;

}
