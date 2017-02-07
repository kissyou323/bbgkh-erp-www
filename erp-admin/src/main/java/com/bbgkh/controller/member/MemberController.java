package com.bbgkh.controller.member;

import com.alibaba.fastjson.JSON;
import com.bbgkh.controller.BaseController;
import com.bbgkh.model.BaseInfo;
import com.bbgkh.model.DTO.MemberInfoDTO;
import com.bbgkh.model.DTO.OldMemberDataDTO;
import com.bbgkh.model.DTO.SaleInfoDTO;
import com.bbgkh.model.PO.SaleInfoPO;
import com.bbgkh.service.IMemberService;
import com.bbgkh.utils.UserUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.bbgkh.controller.BaseConfig.CHARSET;
import static com.bbgkh.controller.BaseConfig.CHARSETX;

/**
 * Created by lixiang01 on 2/6/2017.
 */

@Controller
public class MemberController extends BaseController{

    @Autowired
    private IMemberService memberService;

    @RequestMapping(value = "member/newMember" ,method = RequestMethod.POST, produces = {CHARSET} )
    @ResponseBody
    public String newSaleInfo(MemberInfoDTO memberInfo, HttpServletRequest request, HttpServletResponse response){

        String uid = UserUtils.getUid(request);
        if (uid.equals("")){
            return JSON.toJSONString(new BaseInfo("100","uid为空"));
        }
        memberInfo.setCustomerUid(uid);
        BaseInfo baseInfo = memberService.insert(memberInfo);

        return JSON.toJSONString(baseInfo);
    }

    @RequestMapping(value = "member/addOldMemberData" ,method = RequestMethod.POST, produces = {CHARSET}  )
    @ResponseBody
    public String addOldMemberData(@RequestBody OldMemberDataDTO oldMemberInfo, HttpServletRequest request, HttpServletResponse response){

        String uid = UserUtils.getUid(request);
        if (uid.equals("")){
            return JSON.toJSONString(new BaseInfo("100","uid为空"));
        }
        oldMemberInfo.getSaleInfo().setUid(uid);

        memberService.addOldMemberData(oldMemberInfo);

        return JSON.toJSONString(oldMemberInfo);
    }
}
