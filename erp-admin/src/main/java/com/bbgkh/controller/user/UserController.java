package com.bbgkh.controller.user;

import com.bbgkh.controller.BaseController;
import com.bbgkh.model.PO.CustomerPO;
import com.bbgkh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import reactor.core.publisher.Flux;

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

    @GetMapping("user/validateUser/{name}")
    public String validateUser(@PathVariable String name){
        StringBuffer sb = new StringBuffer();
        for (char c : name.toCharArray()) {
            byte b = (byte)c;
            sb.append(b);
        }
        logger.info("验证登录名，用户输入的用户名为："+name);
        String returnStr = "false";
        List<CustomerPO> customerPOS= userService.validateUser(sb.toString());
        if (customerPOS.size()>0){
            returnStr = "ok";
        }

        return returnStr;

    }

}
