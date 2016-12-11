package com.lixiang.javaNet.day1.testServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by lixiang on 16-10-16.
 */
public class ServerOne {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(8189);
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            Scanner sc = new Scanner(is);
            PrintWriter pw = new PrintWriter(os,true);
            pw.println("Hello , and enter exit to  bye");

            boolean done = false;

            /*while (!done && sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
                pw.println("echo: "+line);
                if(line.trim().equals("exit")){
                    done =true;
                }
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
