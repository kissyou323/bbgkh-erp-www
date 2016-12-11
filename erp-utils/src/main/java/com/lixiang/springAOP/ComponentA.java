package com.lixiang.springAOP;




/**
 * Created by lixiang on 2016/8/1.
 */

public class ComponentA {

        public void before(){
            System.out.println("before");
        }

  /*      public void around(ProceedingJoinPoint call){
            System.out.println("around1");
            try {
                call.proceed();
                System.out.println("around2");
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }*/



}
