package reflect;

import reflect.annotations.AutoRunClass;
import sun.text.resources.uk.FormatData_uk;

import java.io.File;
import java.net.URISyntaxException;

/**
 * 掃描於當前類Test4所在同一個包中的所有類，並實例化那些被@AutoRunClass註解
 * 標註的類
 */

public class Test4 {
    public static void main(String[] args) throws Exception {
        Class cls = Test4.class;
        String packageName = cls.getPackage().getName();
        File dir =  new File(
                cls.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for (File sub:subs ){
            String fileName =  sub.getName();
            String className = fileName.substring(0,fileName.indexOf("."));
            className = packageName+"."+className;
            Class c = Class.forName(className);
            if (c.isAnnotationPresent(AutoRunClass.class)){
                System.out.println("實例化"+className);
                Object o = c.newInstance();
                System.out.println(o);
            }
        }
    }
}
