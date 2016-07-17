package com.love.controller;

import com.alibaba.fastjson.JSON;
import com.love.model.Members;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lixiang on 2016/7/16.
 */
@Controller
public class StudyRest {

    /**
     * 不带参数的GET
     * @return
     */
    @RequestMapping(value = "testHttpClientGet",method = RequestMethod.GET)
    @ResponseBody
    public String testHttpClientGet(){
        return "GetOK";
    }

    /**
     * 带参数的GET
     * @param id
     * @param name
     * @return
     */
    @RequestMapping(value = "testHttpClientGetParams/{id}/{name}",method = RequestMethod.GET)
    @ResponseBody
    public String testHttpClientGetWithParams(@PathVariable int id, @PathVariable String name){
        Members member = new Members(id,name);
        String jsonString = JSON.toJSONString(member);
        return jsonString;
    }
    /**
     * 带有实体的POST
     * @param members
     * @return
     */
    @RequestMapping(value = "testHttpClientPost" , method = RequestMethod.POST)
    @ResponseBody
    public String testHttpClientPost(Members members){
        String jsonString = JSON.toJSONString(members);
        return jsonString;
    }

    /**
     * 测试PUT方法
     * @param id
     * @param members
     * @return
     */
    @RequestMapping(value = "testHttpClientPut/{id}" , method = RequestMethod.PUT)
    @ResponseBody
    public String testHttpClientPut(@PathVariable int id,Members members){
        String jsonString1 = JSON.toJSONString(members);
        String jsonString = jsonString1+id;
        return jsonString;
    }

}
