package file;

import java.io.File;
import java.io.FileFilter;

public class ListFileTest1 {
    public static void main(String[] args) {
        File dir = new File(".");
//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File file) {
//                return file.getName().contains("a");
//            }
//        };


        // 1. @FunctionalInterface 看到這只有一個抽象方法?
        // 2.上面可用lambda表達式替代
        // 3.若是只有參數()都可以省略
        // 4.最後參數可以代換更簡潔(因為只有在此處用)

        // 2.
//        FileFilter filter = (file)->file.getName().contains("a");
        // 3.
//        FileFilter filter = file->file.getName().contains("a");
        // 4.
        FileFilter filter = f->f.getName().contains("a");



        File[] subs = dir.listFiles(filter);
        for (File sub : subs){
            System.out.println(sub.getName());
        }
    }
}
