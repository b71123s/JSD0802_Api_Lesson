package io;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("anki.zip");
        FileOutputStream fos = new FileOutputStream("ankicp.zip");

        byte[] data = new byte[1024*1024*10];
        int d;

        long start = System.currentTimeMillis();
        while ( (d = fis.read(data)) != -1 ){
            fos.write(data,0,d);  // 方法中有一個override(每次大小, 字節開始, 字節結束)
        }
        long end = System.currentTimeMillis();

        System.out.println("複製完畢! 耗時: "+(end-start)+"豪秒");

    }
}
