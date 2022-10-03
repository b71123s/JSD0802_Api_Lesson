package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("picture.png");
        FileOutputStream fos = new FileOutputStream("picture_cp.png");

        long start = System.currentTimeMillis();
        int d;
        while ((d = fis.read()) != -1 ){
            fos.write(d);
        }
        long end = System.currentTimeMillis();
        System.out.println("複製完畢! 耗時: "+((end-start))+"毫秒");
        fis.close();
        fos.close();
    }
}
