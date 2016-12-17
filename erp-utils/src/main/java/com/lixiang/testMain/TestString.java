package com.lixiang.testMain;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lixiang on 10/21/2016.
 */
public class TestString {
    private static String name ;
    private static Map<String,String> map = new HashMap<>();
    static{
        doInit();
    }
    public static void main(String[] args) {
        if(name==null){
            System.out.println("nullnull");
        }
        name="bbbb"+name+"cccc";
        System.out.println(name);
    }
    public static void captialFirstTwo(String orignStr){
        StringBuffer stringBuffer = new StringBuffer(orignStr);

    }

    public static void doInit(){
      //  name =map.get("ccc");
    }

    public static String insertIntoString(int index,String orignStr,String newStr){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(orignStr.substring(0,index));
        stringBuffer.append(newStr);
        stringBuffer.append(orignStr.substring(index));
        return stringBuffer.toString();
    }
}
