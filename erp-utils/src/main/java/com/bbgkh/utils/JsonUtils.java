package com.bbgkh.utils;

import com.alibaba.fastjson.JSON;
import com.bbgkh.model.DTO.SaleInfoDTO;
import com.bbgkh.model.PO.SaleInfoPO;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * Created by lixiang on 11/12/2016.
 */
public class JsonUtils {


    public static void main(String[] args) {
        SaleInfoDTO saleInfoDTO = new SaleInfoDTO();
        saleInfoDTO.setSaleNum(33);
        saleInfoDTO.setColor("red");

        SaleInfoPO saleInfoPO= new SaleInfoPO();

        BeanUtils.copyProperties(saleInfoDTO,saleInfoPO);
        System.out.println(saleInfoPO);


    }

    public static void doOnComple(){
        System.out.println("aaaa");
    }

   /* public static Object copyValue(Object oldValue , Class<?> newClazz){
        Object newObject =null;
        try {
           newObject = newClazz.newInstance();
            for (Field field : newObject.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Field value =null;
                try {
                    value=oldValue.getClass().getDeclaredField(field.getName());
                } catch (NoSuchFieldException e) {
                    continue;
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
                if (value != null) {
                    String name   =value.getName();
                    char[] cs=name.toCharArray();
                    cs[0]-=32;
                    name = String.valueOf(cs);
                    String methodName = "set"+name;
                 //   Type type= field.getType();

                 //   Method setMethod = newObject.getClass().getDeclaredMethod(methodName);
                 //   setMethod.setAccessible(true);
                //    setMethod.invoke(newObject,value);
                    field.set(newObject,value);
                }
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        return newObject;
    }*/
}
