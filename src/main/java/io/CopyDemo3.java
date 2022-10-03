package io;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("picture.png");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("picture_cp.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        long start = System.currentTimeMillis();
        int d;
        while ((d = bis.read()) != -1 ){
            bos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("複製完畢! 耗時: "+((end-start))+"毫秒");
        bis.close();
        bos.close();
    }
}

// 未加上緩衝流之前輸出: 複製完畢! 耗時: 20654毫秒
// 加上緩衝流之前輸出: 複製完畢! 耗時: 101毫秒