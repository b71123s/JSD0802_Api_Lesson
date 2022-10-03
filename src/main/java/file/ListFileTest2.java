package file;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Scanner;

public class ListFileTest2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("請輸入文件名: ");
            String fileName = scanner.nextLine();
            File file = new File(fileName);
                if (file.exists()){
                    System.out.println("該文件已存在!");
                }else {
                    file.createNewFile();
                    System.out.println("該文件已創建!");
                    break;
                }
        }
    }
}
