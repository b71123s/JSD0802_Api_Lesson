package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("fos.txt");

        FileInputStream fis = new FileInputStream(file);
        long len = file.length();
        byte[] data = new byte[(int)len];
        fis.read(data);
        System.out.println("fis.read(data)輸出為: "+fis.read(data));
        System.out.println("data輸出為: "+data);
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println("轉換後的文字輸出: "+line);

//        輸出
//        fis.read(data)輸出為: -1
//        data輸出為: [B@232204a1
//        轉換後的文字輸出: 瀟灑走一回，不枉此生，測試大成功，這是追加模式

        fis.close();
    }
}
