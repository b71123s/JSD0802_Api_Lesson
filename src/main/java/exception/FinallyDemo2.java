package exception;

import java.io.*;

public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("fot.dat");
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出錯了");
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("出錯了");
            }
        }
    }
}
