package file;

import java.io.File;
import java.io.FileFilter;

public class ListFileDemo2 {
    public static void main(String[] args) {
//        File dir = new File(".");
//        if (dir.isDirectory()){
//            FileFilter filter = new FileFilter() {
//                @Override
//                public boolean accept(File file) {
//                    String name = file.getName();
//                    System.out.println("正在過濾的元素是: "+name);
//                    return name.startsWith(".");
//                }
//            };
//            File[] subs = dir.listFiles(filter);
//            System.out.println("當下目錄共: "+subs.length+"個子項");
//        }
        File dir = new File(".");
        if(dir.isDirectory()){
//            FileFilter filter = new FileFilter(){//匿名內部類創建過濾器
//                public boolean accept(File file) {
//                    String name = file.getName();
//                    boolean starts = name.startsWith(".");//名字是否以"."開始
//                    System.out.println("過濾器過濾:"+name+",是否符合要求:"+starts);
//                    return starts;
//                }
//            };
//            File[] subs = dir.listFiles(filter);//方法內部會調用accept方法


            File[] subs = dir.listFiles(new FileFilter(){
                public boolean accept(File file) {
                    return file.getName().startsWith(".");
                }
            });
            for(int i=0;i<subs.length;i++){
                File sub = subs[i];
                System.out.println("符合條件元素: "+sub.getName());
            }
            System.out.println("符合條件元素個素: "+subs.length+"個");
        }



    }
}


            