package com.bbgkh.controller.weixin;

import com.bbgkh.controller.BaseConfig;
import com.bbgkh.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.PrintWriter;

/**
 * Created by lixiang01 on 2/8/2017.
 */
@Controller
public class WXController extends BaseController {

    @RequestMapping(value = {"wx"},method = RequestMethod.GET, produces = BaseConfig.CHARSET)
    public void showPage(@RequestParam(value = "echostr",required = false) String echostr ,PrintWriter out){
        if (echostr != null) {
            logger.info("来自微信服务器的请求："+echostr);
            out.print(echostr);
        }else{
            logger.info("来自微信服务器的请求为空");
        }
        out.flush();
        out.close();
    }
}
