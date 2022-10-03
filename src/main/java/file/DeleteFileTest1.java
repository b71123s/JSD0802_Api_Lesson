package file;

import java.io.File;

public class DeleteFileTest1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100 ; i++) {
            String name = "text" + i + ".txt";
            File file = new File(name);
            file.delete();
            System.out.println("已刪除完畢");
        }
    }
}
