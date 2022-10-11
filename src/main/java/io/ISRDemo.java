package io;

import java.io.*;

public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./src/main/java/io/ISRDemo.java");
        InputStreamReader irs = new InputStreamReader(fis);

        int d;
        while ((d=irs.read()) != -1 ){
            System.out.print((char) d);
        }

        irs.close();
    }
}
