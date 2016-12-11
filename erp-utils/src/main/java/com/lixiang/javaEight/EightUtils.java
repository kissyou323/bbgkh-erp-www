package com.lixiang.javaEight;

import java.util.stream.Stream;

/**
 * Created by lixiang on 2016/8/4.
 */
public class EightUtils {

    public void reduce(){
        int count = Stream.of(1,2,3).reduce(1,(acc,element)->acc+element);

        System.out.println(count);
    }
}
