package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;

public class FileComprehensiveTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/io");

        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File f) {
                String name = f.getName();
                return name.endsWith(".java");
            }
        };

        File[] data = file.listFiles(filter);
        System.out.println("獲取所有資料夾下.java檔案: ");
        System.out.println("--------------------------");
        for (File f:data) {
            System.out.println(f.getName());
        }
        System.out.println("===============================================================================================");
        System.out.println("java檔案內容: ");
        System.out.println("--------------------------");
        for (File f:data) {
            FileInputStream fis = new FileInputStream(f);
            long len = f.length();
            byte[] data1 = new byte[(int)len];
            fis.read(data1);
            String line = new String(data1, StandardCharsets.UTF_8);
            System.out.println("輸出的java文件檔案: ");
            System.out.println(line);
            System.out.println("------------------------------------------------------------------------------------");
            fis.close();
        }

    }
}
