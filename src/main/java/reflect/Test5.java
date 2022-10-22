package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

/**
 * 自動調用與當前類test5所在同一個包中被註解@AutoRunClass標註的類中那些
 * 被註解@AutoRunMethod標註的方法
 */

public class Test5 {
    public static void main(String[] args) throws Exception {
        Class cls = Test5.class;
        String packageName = cls.getPackage().getName();
        File dir = new File(
                cls.getResource(".").toURI()
        ) ;
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));  // 過濾器中要放? 目錄名+getname
        for(File sub:subs){
            String fileName = sub.getName();
            String className = fileName.substring(0,fileName.indexOf("."));
            className = packageName+"."+className;
            Class c = Class.forName(className);
            if(c.isAnnotationPresent(AutoRunClass.class)){
                System.out.println("實例化:"+className);
                Object o = c.newInstance();
                // 獲取該類中的所有方法
                Method[] methods = c.getDeclaredMethods();
                for(Method method : methods){
                    if(method.isAnnotationPresent(AutoRunMethod.class)){
                        System.out.println("自動調用方法:"+method.getName());
                        method.invoke(o);
                    }
                }
            }
        }
    }
}