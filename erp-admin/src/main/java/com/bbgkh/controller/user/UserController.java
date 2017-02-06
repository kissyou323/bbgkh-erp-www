package com.bbgkh.controller.user;

import com.alibaba.fastjson.JSON;
import com.bbgkh.controller.BaseConfig;
import com.bbgkh.controller.BaseController;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.IUserService;
import com.bbgkh.utils.MD5Utils;
import com.bbgkh.utils.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static com.bbgkh.controller.BaseConfig.ACCESS;
import static com.bbgkh.controller.BaseConfig.CHARSET;

/**
 * Created by lixiang on 12/16/2016.
 */
@Controller
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    //#region 验证户名是否已经被使用
    /**
     * 验证用户名是否已经被使用
     * @return
     */
    @PostMapping("user/validateUser")
    @ResponseBody
    public String validateUser(CustomerPO customerPO){

        logger.info("验证登录名，用户输入的用户名为："+customerPO.getName());
        String returnStr = "false";

        List<CustomerPO> customerPOS= userService.validateName(customerPO.getName());
        if (customerPOS.size()==0) {
            returnStr = "ok";
        }

        return returnStr;

    }
    //#endregion

    /**
     * 进行登录
     * @return
     */
    @RequestMapping(value = {"user/login"} ,produces = {CHARSET})
    @ResponseBody
    public String userLogin(HttpServletRequest request,
                            HttpServletResponse response,
                            CustomerPO customerPO){

        logger.info("验证登录名，用户输入的用户名为："+customerPO.getName());
        BaseInfo baseInfo = null;

        Subject subject = SecurityUtils.getSubject() ;
        UsernamePasswordToken token = new UsernamePasswordToken(customerPO.getName(),MD5Utils.getMd5(customerPO.getPassword())) ;
        try {
            subject.login(token);
            baseInfo = new BaseInfo("0","登录成功");
            String uid = StringUtils.getUID(customerPO.getName());
            Cookie cookie = new Cookie("uid",uid);
            cookie.setPath("/bbgkh");
            cookie.setMaxAge(7200);
            response.addCookie(cookie);
            request.getSession(true).setAttribute("customer",customerPO);
        }catch (Exception e){
            //这里将异常打印关闭是因为如果登录失败的话会自动抛异常
            baseInfo = new BaseInfo("100","登录验证失败");
            logger.error("登录验证失败",e);

        }

        return JSON.toJSONString(baseInfo);

    }

    //#region 进行新用户的注册
    /**
     * 进行用户的注册
     * @param customerPO
     * @return
     */
    @PostMapping ("user/registerUser")
    @ResponseBody
    public String registerUser(CustomerPO customerPO){



        int status =userService.insert(customerPO);
        String returnStr ="false";
        if (status ==1){
            returnStr="ok";
        }

        return returnStr;

    }
    //#endregion

}
