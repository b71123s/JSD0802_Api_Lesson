package reflect;

import java.io.File;
import java.net.URISyntaxException;

/**
 * 实例化与当前类Test所在同一个包中的每个类的实例(使用无参构造器)
 */
public class Test {
    public static void main(String[] args) throws URISyntaxException, ClassNotFoundException, InstantiationException, IllegalAccessException {
//        File dir = new File(
//            Test.class.getClassLoader().getResource(".").toURI()
//        );
        /*
            類名.class.getResource(".")表示的就是該類(字節碼文件)所在的目錄
         */
        /*
            思路:
            1:首先定位Test類所在的目錄
            2:獲取該目錄下的所有.class文件
            3:通過每個class文件的文件名確定類名
            4:通過類名加載類對象
            5:通過類對象的newInstance()方法實例化
         */

        // Test.class文件所在的目錄
        Class cls = Test.class;
        File dir = new File(
             cls.getResource(".").toURI()
        );

        // 通過類對象獲取其所在的包的名字
        String packageName = cls.getPackage().getName();
        System.out.println(packageName);

        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            String fileName = sub.getName();  // 獲取文件名
            String className = fileName.substring(0,fileName.indexOf("."));

            className = packageName+"."+className;

            Class c = Class.forName(className);
            Object obj = c.newInstance();
            System.out.println(obj);
        }

        System.out.println(dir);
    }
}
