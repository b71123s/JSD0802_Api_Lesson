package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("pw.txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw =  new PrintWriter(bw,true);
        String str = null;
        while (!"exit".equals(str)){
            Scanner scn = new Scanner(System.in);
            System.out.println("請輸入文字: ");
            str = scn.nextLine();
            pw.println(str);

        }
        pw.close();
        System.out.println("over");

    }
}
