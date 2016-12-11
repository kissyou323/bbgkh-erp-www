package com.dubbo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lixiang on 2016/8/3.
 */
public class testProvider {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        applicationContext.start();
        System.in.read();



      //  com.alibaba.dubbo.container.Main.main(args);
    }
}
