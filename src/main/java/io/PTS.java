package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PTS {
    public static void main(String[] args) throws IOException {

        // 創建一個資料夾
//        File ffolder = new File("PTS");
//        ffolder.mkdir();

        // 創建一個文件PTS.txt-------------------遺忘一次
//        File ftxt = new File("./PTS.txt");
//        ftxt.createNewFile();

        // 創建一個資料夾內涵abcde的子資料夾
//        File fabc = new File("a/b/c/d/e");
//        fabc.mkdirs();

        // 在創建的檔案PTS寫下 "恭喜測試完成"-------------------遺忘一次
//        FileOutputStream file = new FileOutputStream("PTS.txt",true);
//        String line = "恭喜測試完成";
//        int len = line.length();
//        System.out.println(len);
//        byte[] data = line.getBytes(StandardCharsets.UTF_8); // gB方法將字符串轉換成數組並回傳
//        file.write(data); // 將數組寫入文件中

        // 在創建的檔案PTS再寫下，CGS!--------------------------遺忘一次
//        line = "，CGS";
//        byte[] data2 = line.getBytes(StandardCharsets.UTF_8);
//        file.write(data2);

        // 讀取PTS.txt內容 --------------------------遺忘一次
//        File file = new File("PTS.txt");
//        FileInputStream fis = new FileInputStream(file);
//        long len = file.length();
//        byte[] data = new byte[(int)len];
//        fis.read(data);
//        String line = new String(data,StandardCharsets.UTF_8);
//        System.out.println(line);

        // 複製一個圖片，名稱加上_cp--------------------------遺忘一次
//        FileInputStream fis = new FileInputStream("picture.PNG");
//        FileOutputStream fos = new FileOutputStream("picture_CP.PNG");
//        int d;
//        while (  (d = fis.read()) != -1  ){
//            fos.write(d);  // 一次讀一組字節
//            System.out.println(d);  // 8位2進制，所以數字為0~255
//        }
//        System.out.println("複製完成!");

        // 完成15KB的塊讀寫
        FileInputStream fis = new FileInputStream("picture.PNG");
        FileOutputStream fos = new FileOutputStream("picture_cp.PNG");
        byte[] data = new byte[15*1024];
        for (int i = 0; i < 10; i++) {
            fis.read(data);
            fos.write(data);
        }





        // 將文字序列化，PTS.txt檔的
        // 檔案文字反序列化讀出 "恭喜測試完成，CGS!"

        // 創建一物件為watch把內容寫道PTS2.obj上，序列化，和反序列化，可順利讀到文字




    }
}
