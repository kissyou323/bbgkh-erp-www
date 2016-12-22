package com.bbgkh.utils;

import java.lang.reflect.Field;

/**
 * Created by lixiang on 12/20/2016.
 */
public class ReflectUtils {
    public static void main(String[] args) {
        try {
            Class<?> clazz  = Class.forName("com.bbgkh.model.enums.ColorEnum");

            for (Field field : clazz.getDeclaredFields()) {
                if(field.getType()!=String.class){
                    field.setAccessible(true);
                    System.out.println(field);
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
