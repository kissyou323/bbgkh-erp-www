package com.lixiang.AOPintroduction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.DynamicIntroductionAdvice;
import org.springframework.aop.IntroductionInfo;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

/**
 * Created by lixiang on 2016/8/2.
 */
public class DAOExtendsAdvisor extends DefaultIntroductionAdvisor {

    public DAOExtendsAdvisor(){
        super(new DAOIntroductionAdvice(), DAOExtendsInterface.class);
    }

    public DAOExtendsAdvisor(Advice advice) {
        super(advice);
    }

    public DAOExtendsAdvisor(Advice advice, IntroductionInfo introductionInfo) {
        super(advice, introductionInfo);
    }

    public DAOExtendsAdvisor(DynamicIntroductionAdvice advice, Class<?> intf) {
        super(advice, intf);
    }
}
