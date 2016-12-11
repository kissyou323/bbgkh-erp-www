package com.lixiang.javaEight.JavaNet;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * Created by lixiang on 2016/7/28.
 */
public class NetMain {
    public static void main(String[] args) {
        try {
           String hostname = "time.nist.gov";
            Socket socket = new Socket(hostname,13);
            InputStream inputStream = socket.getInputStream();
            StringBuffer time = new StringBuffer();
            int c;
            while ((c=inputStream.read())!=-1) {
                time.append((char)c);
            }
            String timeString = time.toString().trim();
            System.out.println(timeString);
            inputStream.close();
        }  catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
