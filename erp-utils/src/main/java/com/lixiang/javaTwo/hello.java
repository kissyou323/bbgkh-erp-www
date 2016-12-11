package com.lixiang.javaTwo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lixiang on 10/1/2016.
 */
public class hello {
    public static void main(String[] args) {
        String work_dir = System.getProperty("user.dir")+"\\test_files";
        String fileName = work_dir+"\\a.txt";
        try {
            FileReader fr = new FileReader(fileName);
            char[] cs = new char[100];
            fr.read(cs);
            System.out.println(cs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
