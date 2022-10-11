package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        osw.write("osw測試中");
        osw.write("好啊~");
        System.out.println("寫出完畢");
        osw.close();
    }
}
