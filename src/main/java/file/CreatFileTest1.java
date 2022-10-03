package file;

import java.io.File;
import java.io.IOException;

public class CreatFileTest1 {
    public static void main(String[] args) throws IOException {
        //練習1-當前目錄創建100個test1.txt-test100.txt
        for (int i = 1 ; i <= 100; i++) {
            String name = "text" + i + ".txt";
            File file = new File(name);
            file.createNewFile();
        }
        System.out.println("100個文件創建完畢");
    }

}

