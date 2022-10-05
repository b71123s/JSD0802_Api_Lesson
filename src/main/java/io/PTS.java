package io;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public class PTS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

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
//        FileInputStream fis = new FileInputStream("picture.PNG");
//        FileOutputStream fos = new FileOutputStream("picture_cp.PNG");
//        byte[] data = new byte[15*1024];
//        int d;
//        while ( (d = fis.read(data)) != -1 ){
//            fos.write(data,0,d);
//        }

        // 將物件序列化，PTS.txt檔的
//        String name = "elijah";
//        int age = 20;
//        String[] aother = {"nice", "good", "fast"};
//        PTSO one = new PTSO(name, age, aother);
//
//        FileOutputStream fos = new FileOutputStream("PTS.obj");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(one);
//
//        FileInputStream fis = new FileInputStream("PTS.obj");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        PTSO p =(PTSO)ois.readObject();
//        System.out.println(p);
//
//        oos.close();
//        ois.close();

        // 用緩衝流完成複製照片
        FileInputStream fis = new FileInputStream("picture.PNG");
        BufferedInputStream bis =  new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("picture_cp.PNG");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len;

        while ((len = bis.read()) != -1){

            bos.write(len);
            System.out.println(len);
        }
        System.out.println("已完成");
        bis.close();
        bos.close();

    }
}
