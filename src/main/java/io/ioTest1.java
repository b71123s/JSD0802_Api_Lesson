package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioTest1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("word.txt");
        for (int i = 0; i < 26; i++) {
            fos.write(97+i);
            System.out.println();
        }
        fos.close();
    }
}
