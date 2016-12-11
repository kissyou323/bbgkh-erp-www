package com.lixiang.studyThread.day1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by lixiang on 9/6/2016.
 */
public class ThreadDay2 {


    private final Set<Integer> mySet = new HashSet<>();

    public synchronized void addNum(int a){
        mySet.add(a);
    }

    public synchronized boolean containsNum(int a){
        return mySet.contains(a);
    }

}
