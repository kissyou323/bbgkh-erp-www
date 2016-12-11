package com.lixiang.cglib;

/**
 * Created by lixiang on 2016/8/2.
 */
public class testCglib {
    public static void main(String[] args) {
        BookFacadeProxy cglib = new BookFacadeProxy();
        BookFacadeImpl bookCglib = (BookFacadeImpl)cglib.getInstance(new BookFacadeImpl());
        bookCglib.addBook();
        Thread.getAllStackTraces().keySet();

    }
}
