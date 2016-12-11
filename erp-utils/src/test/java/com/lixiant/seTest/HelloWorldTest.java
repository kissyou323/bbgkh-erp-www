package com.lixiant.seTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lixiang on 9/30/2016.
 */
public class HelloWorldTest {

    @Test
    public void testsayHello(){
        System.out.println("hello");
        assertEquals("hello","shello");
    }
}
