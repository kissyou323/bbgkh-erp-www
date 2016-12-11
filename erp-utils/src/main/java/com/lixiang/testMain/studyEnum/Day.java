package com.lixiang.testMain.studyEnum;

/**
 * Created by lixiang on 05/11/2016.
 */
public enum  Day {
    Mon("Monday"), Tue("Tuesday");

    protected  String day;

    Day(String day) {
        this.day=day;
    }

    public static void printDay(){

    }
}
