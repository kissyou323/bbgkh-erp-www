package com.dubbo.demo.ServiceImp;

/**
 * Created by lixiang on 2016/8/3.
 */


import com.dubbo.demo.DemoService;
import java.util.Date;

public class DemoServiceImp implements DemoService{
    @Override
    public String say(){

        return "hello from provider"+new Date();
    }
}
