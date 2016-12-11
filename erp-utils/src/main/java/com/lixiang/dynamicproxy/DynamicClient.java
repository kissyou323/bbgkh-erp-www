package com.lixiang.dynamicproxy;


/**
 * Created by lixiang on 2016/7/2.
 */
public class DynamicClient {


    public static void main(String[] args) {




        //生成代理
     //   Subject subject =(Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),handler.getSub().getClass().getInterfaces(),handler);
        Subject subject = (Subject) ProxySubject.getObject();
        subject.request();
    }


}
