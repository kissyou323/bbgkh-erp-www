package com.lixiang.javaEight.studyClock;

import java.time.Clock;
import java.time.LocalTime;

/**
 * Created by lixiang on 8/23/2016.
 */
public class StudyClock {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }
}
