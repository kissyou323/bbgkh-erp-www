package com.lixiang.jvm.day1;

/**
 * Created by lixiang on 16-10-8.
 */
public class StackSOF  {
    private int stacklength=1;

    public void stackLeak(){
        stacklength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        StackSOF sof = new StackSOF();
        try {
            sof.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:" + sof.stacklength);
            throw e;
        }
    }
}
