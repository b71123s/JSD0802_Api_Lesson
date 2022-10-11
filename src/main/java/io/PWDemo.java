package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("pw.txt");
        pw.println("我要向高山舉目");
        pw.println("我的幫助從何來");
        System.out.println("書寫完");
        pw.close();
    }
}
