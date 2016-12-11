package com.lixiang.AOPintroduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixiang on 2016/8/2.
 */
public class TestIntroductionAdvisor {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringAOP.xml");
        DAOInterface onDaoImplementProxy = (DAOInterface)applicationContext.getBean("oneDAOImplementProxy");
        ((DAOExtendsInterface)onDaoImplementProxy).sayNew();
    }
}
