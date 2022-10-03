package file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        String name = file.getName();
        System.out.println("名子: "+name);

        long length = file.length();
        System.out.println("長度: "+length+"字節");

        boolean cr = file.canRead();
        System.out.println("是否可讀: "+ cr);

        boolean ih = file.isHidden();
        System.out.println("是否隱藏: "+ih);
    }
}
