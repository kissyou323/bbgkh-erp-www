package com.lixiang.StudyNIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by lixiang on 10/17/2016.
 */
public class ChannelBuffer {
    public static void main(String[] args) {
        try {
            RandomAccessFile accessFile = new RandomAccessFile("E:\\test.txt","rw");
            FileChannel fileChannel = accessFile.getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(20);
            int charRead = fileChannel.read(buffer);
            while (charRead!=-1){
                buffer.flip();
                while (buffer.hasRemaining()){
                    System.out.println((char)buffer.get());
                }
                buffer.clear();
                charRead=fileChannel.read(buffer);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
