package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {
    public static void main(String[] args) throws IOException {
//        File file =  new File("fos.dat");
//        FileOutputStream fos = new FileOutputStream(file);

    FileOutputStream fos = new FileOutputStream("fos.dat");
    fos.write(1);
    fos.write(13);
    fos.close();
    }

}
