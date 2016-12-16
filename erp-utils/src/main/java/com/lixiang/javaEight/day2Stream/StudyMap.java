package com.lixiang.javaEight.day2Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lixiang on 8/24/2016.
 */
public class StudyMap {
    public static void main(String[] args) {
        //0是初始值
        /*int count=Stream.of(1,2,3).reduce(10,(acc,element)->acc+element);
        System.out.println(count);*/
      //  System.out.println((byte)'a');
        studymap();
    }

    public static void studymap(){
        String name = "lixiang";
     //   List<Object> characters = Arrays.asList(name.toCharArray());
     //   List<Object> integers =characters.stream().map(value->(byte)value).collect(Collectors.toList());
    //    System.out.println(integers);

      /*  Stream.of(name.toCharArray())
                .map(value-> )*/
        /*List<String> list = Stream.of("a", "b", "c").map(s -> s.toUpperCase()).collect(Collectors.toList());
        list.forEach(x-> System.out.println(x));*/
    }

}
