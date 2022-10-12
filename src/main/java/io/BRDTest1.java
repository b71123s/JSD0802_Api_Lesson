package io;

import java.io.*;

public class BRDTest1 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/java/io");

        File[] subs = file.listFiles((f)->f.getName().endsWith(".java"));
        for (File sub: subs) {

            FileInputStream fis = new FileInputStream(sub);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            String line;
            while ((line =  br.readLine())!=null){
                System.out.println(line);
            }
        }




    }
}
