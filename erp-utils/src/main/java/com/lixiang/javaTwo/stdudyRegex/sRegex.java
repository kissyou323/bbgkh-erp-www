package com.lixiang.javaTwo.stdudyRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lixiang on 10/7/2016.
 */
public class sRegex {
    public static void main(String[] args) {
        String pattern_string = "[0-9][a-z]*";
        String aaa = "9dd6cc";
        Pattern pattern = Pattern.compile(pattern_string);
        Matcher matcher=pattern.matcher(aaa);
        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            String sub = aaa.substring(start,end);
            System.out.println(sub);
        }
    }
}
