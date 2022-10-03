package file;

import java.io.File;

public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("a");
        if (dir.exists()){
            dir.delete(); // 只能刪除空目錄，有東西會刪失敗，加s沒這方法
            System.out.println("該目錄已刪除!");
        }else{
            System.out.println("該目錄不存在!");
        }
    }
}
