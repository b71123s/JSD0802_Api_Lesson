package exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutocloseDemo {
    public static void main(String[] args) {
        // 僅有實現AutoCloseable接口的類才能在這裡定義
        try (FileOutputStream fos = new FileOutputStream("fot.dat");) {
            fos.write(1);
        } catch (IOException e) {
            System.out.println("出錯了");
        }

    }
}
