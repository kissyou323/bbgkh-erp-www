//package com.lixiang.IOC;
//
//import com.lixiang.model.IOC.PersonBean;
//import org.springframework.beans.factory.support.DefaultListableBeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.jca.cci.core.InteractionCallback;
//
//import java.util.HashMap;
//import java.util.Map;
//
//
///**
// * Created by lixiang on 2016/7/14.
// */
//public class Main {
//
//
//    public static void main(String[] args) {
//
//
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringContext.xml");
//
//        PersonBean personBean = (PersonBean) applicationContext.getBean("personBean");
//
//        System.out.println(personBean.getName());
//
//
//    }
//
//    public static void useBeanFactory(){
//        //对资源进行定位
//        ClassPathResource res = new ClassPathResource("/SpringContext.xml");
//        //初始化工厂
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        //载入
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//
//        //注册
//        reader.loadBeanDefinitions(res);
//        PersonBean personBean = factory.getBean("personBean", PersonBean.class);
//        System.out.println(personBean.getName());
//    }
//}
