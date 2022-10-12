package io.practice;


import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class PTS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // 創建一個資料夾
//        File ffolder = new File("PTS");
//        ffolder.mkdir();``----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

























        // 創建一個文件PTS.txt-------------------遺忘一次
//        File ftxt = new File("./PTS.txt");
//        ftxt.createNewFile();

        // 創建一個資料夾內涵abcde的子資料夾
//        File fabc = new File("a/b/c/d/e");
//        fabc.mkdirs();

        // write讀字測試
        FileOutputStream fos = new FileOutputStream("fos.txt");
        fos.write(-1);

        FileInputStream fis = new FileInputStream("fos.txt");
        System.out.println(fis.read());

        // 篩選出名子中有txt的文件
//        File file = new File(".");
//        FileFilter filter = f->{
//                String name = f.getName();
//                return name.endsWith(".txt");
//        };
//        File[] subs = file.listFiles(filter);
//        for( File sub:subs ){
//            System.out.println(sub.getName());
//        }

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
//        Scanner scn = new Scanner(System.in);
//        System.out.println("請輸入姓名: ");
//        String name = scn.nextLine();
//        System.out.println("請輸入年齡: ");
//        int age = scn.nextInt();
//        System.out.println("請輸入信箱: ");
//        String email = scn.next();
//        PTSO one = new PTSO(name, age, email);
//        FileOutputStream fos = new FileOutputStream("PTS.obj",true);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(one);
//        FileInputStream fis = new FileInputStream("PTS.obj");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        PTSO p =(PTSO)ois.readObject();
//        System.out.println(p);
//        oos.close();
//        ois.close();

        // 用緩衝流完成複製照片
//        FileInputStream fis = new FileInputStream("picture.PNG");
//        BufferedInputStream bis =  new BufferedInputStream(fis);
//
//        FileOutputStream fos = new FileOutputStream("picture_cp.PNG");
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//        int len;
//        while ((len = bis.read()) != -1){  //READ判斷式放裡面才可以重複執行，放外面只會吃到第一組數據
//            bos.write(len);
//            System.out.println(len);
//        }
//        System.out.println("已完成");
//        bis.close();
//        bos.close();

        // 中控台輸入字的時候會把他寫入PTS.txt，但只要輸入為exit會結束程式
//        FileOutputStream fis = new FileOutputStream("PTS.txt",true);
//        Scanner scn = new Scanner(System.in);
//        System.out.println("請輸入要寫入文件中的字: ");
//        String str =  scn.nextLine();
//        System.out.println("您輸入的字為: "+str);
//        byte[] strb =  str.getBytes(StandardCharsets.UTF_8);
//        if ("exit".equals(str)){
//            System.out.println("結束程式!");
//        }else {
//            fis.write(strb);
//        }
//        fis.close();

        // 緩衝流寫出未調flush寫不進去，和寫進後的樣子
//        FileOutputStream fos = new FileOutputStream("PTS.txt",true);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        String str = " how are you? ";
//        byte[] line = str.getBytes(StandardCharsets.UTF_8);
//        bos.write(line);
//        bos.flush();
//        bos.close();

        // 做一個使用緩衝流和未使用緩衝流的速度對比
//        FileInputStream fis = new FileInputStream("picture.PNG");
//        FileOutputStream fos = new FileOutputStream("pictute_nbcp.PNG");
//        int d;
//        long start = System.currentTimeMillis();
//        while ((d = fis.read()) != -1){
//            fos.write(d);
//        }
//        long end = System.currentTimeMillis();
//        FileInputStream fisb = new FileInputStream("picture.PNG");
//        BufferedInputStream bis = new BufferedInputStream(fisb);
//        FileOutputStream fosb = new FileOutputStream("picture_bcp.PNG");
//        BufferedOutputStream bos = new BufferedOutputStream(fosb);
//        int len;
//        long bstart = System.currentTimeMillis();
//        while ((len = bis.read()) != -1){
//            bos.write(len);
//        }
//        long bend = System.currentTimeMillis();
//        System.out.println("未加入緩衝流復製時間: "+(end-start)+"毫秒");
//        System.out.println("加入緩衝流複製時間: "+(bend-bstart)+"毫秒");
//        fis.close();
//        fos.close();
//        bis.close();
//        bos.close();

        // 讀取PTS.txt的文檔，如果遇到數字就拿出來放到PTS2.txt文檔 ?

        // 1. 是否有註冊，有的畫比對文檔，有的顯示登入成功，沒有回覆請註冊，註冊頁面輸入Admin則可察看所有註冊訊息(在輸入exit跳出) ?
        // 2. 若沒註冊跳出 請完成註冊，並輸入姓名，信箱，年齡的註冊(同步正規畫驗證)，登入完詢問是否要顯示，要則顯示並登入完成，不要顯示登入完成
        // 3. 已登入狀態下跳出選單 1.新增資料夾 2.選擇圖片 3.複製圖片到指定資料夾







    }
}
