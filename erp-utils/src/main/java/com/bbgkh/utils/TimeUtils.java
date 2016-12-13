package com.bbgkh.utils;

import java.util.Calendar;

/**
 * Created by lixiang on 12/13/2016.
 */
public class TimeUtils {

    public static void currentTime(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.MILLISECOND));
    }

    public static void main(String[] args) {
        currentTime();
    }
}
