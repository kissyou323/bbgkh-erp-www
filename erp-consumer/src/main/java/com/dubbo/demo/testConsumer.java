package com.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lixiang on 2016/8/3.
 */
public class testConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        applicationContext.start();

        DemoService demoService = (DemoService) applicationContext.getBean("demoService");

        System.out.println(demoService.say());
        System.in.read();
    }
}
