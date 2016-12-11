package com.lixiang.javaEight.testFor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by lixiang on 2016/7/2.
 */
public class TestFor {
    public static void main(String[] args) {

        Predicate<Integer> predicate = x->x>3;

        List<Integer> list = new ArrayList<>();
        list.add(new Integer(4));
        list.add(new Integer(5));
        list.add(new Integer(10));

        List<Integer> list1 = new ArrayList<>();
        list1.add(new Integer(6));
        list1.add(new Integer(7));
        list1.add(new Integer(15));
/*        Long a = list.stream().filter(num-> {if(num.intValue()>5)
            System.out.println(num.intValue());
        return num.intValue()>5;}).count();
        System.out.println(a);
*/

/*
        Long b = list.stream().filter(num->predicate.test(num.intValue())).count();
        System.out.println(b);
*/


/*        List<String> collected = Stream.of("a","ba","cad").map(string->string.toUpperCase()).collect(Collectors.toList());
        List<String> collected2 = Stream.of("a","ba","cad").filter(string->{string.toUpperCase();return true;}).collect(Collectors.toList());

        System.out.println(collected2);*/

        List<Integer> integerList = Stream.of(list,list1).flatMap(nums->nums.stream()).collect(Collectors.toList());

        int a = integerList.stream().max(Comparator.comparing(num->num.intValue())).get();

        System.out.println(a);

    }

}
