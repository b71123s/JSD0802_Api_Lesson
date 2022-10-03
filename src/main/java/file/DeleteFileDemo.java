package file;

import java.io.File;

public class DeleteFileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件真刪除了");
        }else{
            System.out.println("該文件不存在");
        }
    }

}
