package com.lixiang.NormalUtils;

/**
 * Created by lixiang on 2016/8/5.
 */
public class SIngleTonTest {
    private static SIngleTonTest ourInstance = new SIngleTonTest();

    public static SIngleTonTest getInstance() {
        return ourInstance;
    }

    private SIngleTonTest() {
    }
}
