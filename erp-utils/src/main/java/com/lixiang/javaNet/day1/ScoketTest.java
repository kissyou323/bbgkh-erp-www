package com.lixiang.javaNet.day1;

import org.springframework.mail.javamail.InternetAddressEditor;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Created by lixiang on 16-10-16.
 */
public class ScoketTest {
    public static void main(String[] args) {
        try {


            Socket s = new Socket();
            s.connect(new InetSocketAddress("weibo.com",80),1000);
            InputStream is = s.getInputStream();
            Scanner sc = new Scanner(is);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
