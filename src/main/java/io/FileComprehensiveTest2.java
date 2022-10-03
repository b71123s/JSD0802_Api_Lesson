package io;  // 對應文檔Test5、6

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class FileComprehensiveTest2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scn = new Scanner(System.in);

        System.out.println("歡迎註冊!");
        System.out.println("請輸入姓名: ");
        String name = scn.nextLine();
        System.out.println("請輸入密碼: ");
        String password = scn.nextLine();
        System.out.println("請輸入暱稱: ");
        String nickname = scn.nextLine();
        System.out.println("請輸入年齡: ");
        int age = scn.nextInt();
        User u = new User(name,password,nickname,age);

        name = (name + ".obj");

        // 寫成文件
        FileOutputStream fos = new FileOutputStream(name);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(u);
        System.out.println("註冊完畢!");

        System.out.println("是否要查看註冊信息? Y/N ");
        String isout = scn.next();
        String isoutfinal = isout.toUpperCase(Locale.ROOT);

        FileInputStream fis = new FileInputStream(name);
        ObjectInput ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();

        if ("Y".equals(isoutfinal)){
            if (obj instanceof User) {
                User user = (User) obj;
                System.out.println(user);
                System.out.println("完成檔案讀取!");

                oos.close();
                ois.close();
            }
        }else {
            System.out.println("程序已結束!");
        }

        System.out.println("----------------------------------------");
        System.out.println("輸出所有User類的資料: ");
        File file = new File("./");

        File[] subs = file.listFiles(f->f.getName().endsWith(".obj"));
        for (File objs :subs) {
            FileInputStream fis2 = new FileInputStream(objs);
            ObjectInput ois2 = new ObjectInputStream(fis2);

            Object objss= ois2.readObject();
            if (objss instanceof User){
                System.out.println(objss);
            }


        }












    }
}
