package com.bbgkh.controller.attribute;

import com.bbgkh.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lixiang on 02/01/2017.
 */
@Controller
public class AttributeController extends BaseController{

    @RequestMapping(value = "attribute/getAllAttribute")
    @ResponseBody
    public String getAllAttribute(HttpServletRequest request){


        return "";
    }
}
