package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos =new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        String line = "有一曙光";
        bos.write(line.getBytes(StandardCharsets.UTF_8));

        bos.flush();
        System.out.println("寫出完畢!");
        bos.close();
    }
}
