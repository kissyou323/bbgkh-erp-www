package com.lixiang.javaTwo;

import java.util.Arrays;

/**
 * Created by lixiang on 10/18/2016.
 */
public class breakTest {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("J="+j);
                if(j==1)
                break;
            }
        }*/
        aaa();
    }


    public static void aaa(){
        try {
            Object a =null ;
            System.out.println(a.toString());
        }catch (Exception e){
            System.out.println("有错");
            System.out.println(Arrays.asList(e.getStackTrace()).toString());
        }


    }

    public static int bbb(){
        return 3;
    }
}
