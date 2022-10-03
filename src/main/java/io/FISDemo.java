package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.dat");

        // 00000001  00000000  00000000  00000000


        // 讀取第一個字節
        int d = fis.read();
        System.out.println(d);

        d = fis.read();
        System.out.println(d);

        d = fis.read();
        System.out.println(d);

        d = fis.read();
        System.out.println(d);

    }
}
