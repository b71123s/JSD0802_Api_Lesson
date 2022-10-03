package file;

import java.io.File;

public class ListFileDemo {
    public static void main(String[] args) {
        File dir= new File(".");
        if (dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println("當前目錄下共: "+ subs.length+"個子項");
            for (File sub: subs){
                System.out.println(sub.getName());
            }
        }
    }
}
