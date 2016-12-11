package com.lixiang.String;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.String.valueOf;

/**
 * Created by lixiang on 2016/8/13.
 */
public class StringUtils {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127){
                    System.out.println("* byte");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }

    }

    public void format(){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            String num = String.format("%03d",x );
            int length = s1.length();
            System.out.print(s1);
            for (int j = 0; j < 15 - length; j++) {
                System.out.print(" ");
            }
            System.out.print(num);
            System.out.println();
            //Complete this line
        }
        System.out.println("================================");
    }

    public String insert(){
        String a = "{'proStatus':'5','proMsg':'重要信息缺失，验证失败，请返回重试！',}";
        int length = a.length();
        StringBuilder sb = new StringBuilder(a);
        String back = "'forwadUrl':"+"'"+"loginBack"+"'";
        sb.insert(length-1,back);
        String newStr = sb.toString();
        byte[] bs = newStr.getBytes();
        System.out.println(bs);
        return sb.toString();
    }
}
