package com.bbgkh.controller.replenish;

import com.bbgkh.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**进货用的Controller
 * Created by lixiang on 01/01/2017.
 */
@Controller
public class ReplenishController extends BaseController{

    @RequestMapping(value = "replenish/newReplenish")
    @ResponseBody
    public ModelAndView getNewReplenishPage(HttpServletRequest request){


        ModelAndView modelAndView = null;
        try {
            modelAndView = new ModelAndView("replenish/newReplenish");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return modelAndView;
    }
}
