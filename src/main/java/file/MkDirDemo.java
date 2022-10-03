package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {

        // mkdir() 目錄創建
        //                           ./ 可以不寫，默認就是這樣
        File dir = new File("demo");
        if (dir.exists()){
            System.out.println("該目錄已存在!");
        }else{
            dir.mkdir();
            System.out.println("該目錄已創建!");
        }


        // mkdirs() 一次把不存在副目錄一並創建,推薦使用
        File dirs = new File("a/b/c/d/e/f/g");
        if (dirs.exists()){
            System.out.println("該目錄已存在!");
        }else{
            dirs.mkdirs();
            System.out.println("該目錄已創建!");
        }



    }
}
