package com.lixiang.javaTwo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by lixiang on 10/7/2016.
 */
public class FileOut {
    public static void main(String[] args) {
        String work_dir = System.getProperty("user.dir")+"\\test_files";

        String fileName = work_dir+"\\out.txt";
        PrintWriter out = null;
        try {
             out = new PrintWriter(fileName);
            out.print("aaaaaaaa");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            out.close();
        }
    }
}
