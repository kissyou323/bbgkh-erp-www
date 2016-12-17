package com.bbgkh.controller.user;

import com.bbgkh.controller.BaseController;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.IUserService;
import com.bbgkh.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import reactor.core.publisher.Flux;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
    @PostMapping("user/login")
    @ResponseBody
    public String userLogin(HttpServletRequest request,
                            HttpServletResponse response,
                            CustomerPO customerPO){

        logger.info("验证登录名，用户输入的用户名为："+customerPO.getName());
        String returnStr = "false";
        List<CustomerPO> customerPOS = new ArrayList<>();
        try {

            customerPOS= userService.validateUser(customerPO.getName(),customerPO.getPassword());
        }catch (Exception e){
            e.printStackTrace();
        }
        if (customerPOS.size()>0) {
            //set cookie and session
            String uid = customerPOS.get(0).getUid();
            Cookie cookie = new Cookie("uid",uid);
            cookie.setPath("/bbgkh");
            cookie.setMaxAge(7200);
            response.addCookie(cookie);
            request.getSession(true).setAttribute("customer",customerPOS.get(0));
            returnStr = "ok";


        }

        return returnStr;

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
