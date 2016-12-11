package com.lixiang.studyException;

/**
 * Created by lixiang on 10/31/2016.
 */
public class Main {

    boolean testEx() throws Exception {
        boolean ret = true;

            ret = testEx1();
        return ret;
    }

    boolean testEx1() throws Exception {
        boolean ret = true;

            ret = testEx2();
            if (!ret) {
                return false;
            }
            System.out.println("testEx1, at the end of try");
            return ret;

    }

    boolean testEx2() throws Exception {
        boolean ret = true;

            int b = 12;
            int c;
            for (int i = 2; i >= -2; i--) {
                c = b / i;
                System.out.println("i=" + i);
            }
            return true;

    }

    public static void main(String[] args) {
        Main testException1 = new Main();
        String a =null;
        try {
            a= "aaaaa";
            testException1.testEx();
        } catch (Exception e) {
            System.out.println("catch里面"+a);
            System.out.println(".....到哪里处理呢");
        }finally {
            System.out.println("finally里面"+a);
            System.out.println("我现在在finally里面");
        }
        System.out.println("finally外部"+a);
    }
}
