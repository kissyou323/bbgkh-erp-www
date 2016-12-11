package com.lixiang.NormalUtils;

import java.util.*;

/**
 * Created by lixiang on 9/1/2016.
 */
public class studyQueue {

    private  static Queue<Integer> integerQueue = new ArrayDeque<>();


    public static void main(String[] args) {
        queue();

    }

    public static void queue(){
        integerQueue.addAll(Arrays.asList(6,3,1,7,5,8,9,2,4));

        List<Integer> qqnumb = new ArrayList<>();

        int length=integerQueue.size();
        while (integerQueue.size()>0){
            if (1==integerQueue.size()){
                qqnumb.add(integerQueue.poll());
                break;
            }
            qqnumb.add(integerQueue.poll());
            integerQueue.offer(integerQueue.poll());
        }

        qqnumb.forEach(x-> System.out.println(x));

    }

    public static void display(){
        integerQueue.forEach(x-> System.out.println(x));
    }
}
