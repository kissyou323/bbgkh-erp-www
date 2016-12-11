package com.lixiang.AOPintroduction;

import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by lixiang on 2016/8/2.
 */
public class DAOIntroductionAdvice extends DelegatingIntroductionInterceptor implements DAOExtendsInterface {
    @Override
    public void sayNew() {
        System.out.println("this is new sayNew");
    }
}
