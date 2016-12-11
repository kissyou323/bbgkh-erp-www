package com.lixiang.reflectUtils;

import com.lixiang.NormalUtils.TongOrder;
import org.springframework.core.annotation.Order;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by lixiang on 2016/8/6.
 */
public class TestReflect {


    public static void main(String[] args) {
        test();
    }

    public static void test(){
        try {
            Class clazz= Class.forName("com.lixiang.NormalUtils.TongOrder");

            Field field = clazz.getDeclaredField("gettongOrder");
            field.setAccessible(true);
            TongOrder tong = (TongOrder) field.getDeclaringClass().newInstance();



            Method method = clazz.getDeclaredMethod("getAseOrder");

            method.invoke(tong);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
