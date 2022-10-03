package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WriteStringTest1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("note.txt");
        Scanner scn = new Scanner(System.in);

        while (true){
        System.out.println("請輸入要寫入的字: ");
        String str = scn.nextLine();

        // 以後統一字面量在equals前面，量在後，避免空指針異常
        if ("exit".equals(str)){
            break;
        }

        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        file.write(data);
        file.close();
        }

        System.out.println("程序已結束!");

    }
}
