package com.lixiang.javaEight.day1;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created by lixiang on 2016/8/22.
 */
public class sample {

    public static void main(String[] args) {
        //samples();
        //sampleA();
        sampleB();
    }

    public  static void samples() {
        Runnable noArgument = () -> System.out.println("hello");
        Thread thread = new Thread(noArgument);
        thread.start();
    }

    public static void sampleA(){
        BinaryOperator<Integer> add =(x,y)->x+y;
        System.out.println(add.apply(1,2));
    }

    public static void sampleB(){
        Predicate<Integer> atLeast5 = x->x>5;
        System.out.println(atLeast5.test(3));
    }
}
