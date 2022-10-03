package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt", true);  // (name, append是追加模式)改為true每次執行型就不會把之前內容覆蓋

        String line = "，測試大成功";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);

        line = "，這是追加模式";
        data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);


    }
}
