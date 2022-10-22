package reflect;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;

/**
 * 自動調用與當前類Test3在同一個包中這些類的公開的，無參的，名字裡含
 * 有字母"s"的方法
 */
public class Test3 {
    public static void main(String[] args) throws Exception {
        Class cls = Test3.class;
        String packageName = cls.getName();

        // 定位Test3.class所在的目錄
        File dir = new File(
          cls.getResource(".").toURI()
        );
        System.out.println(dir);

        // 獲取該目錄下的所有字節碼文件(目的是確定同一個包中的所有類)
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            String fileName = sub.getName();
            String className = fileName.substring(0,fileName.indexOf("."));
            className = packageName+"."+className;
            System.out.println(className);

            // 實例化
            Class c = Class.forName(className);

            // 如果該類沒有公開的無參構造器就略過
            Constructor con = c.getDeclaredConstructor();
            if(con.getModifiers()!=Modifier.PUBLIC){
                continue;
            }
            Object obj = c.newInstance();
            System.out.println(obj);

            Method[] methods = c.getDeclaredMethods();
            for(Method m : methods){
                if(m.getParameterCount()==0
                        &&
                        m.getName().contains("s")
                        &&
                        m.getModifiers()==Modifier.PUBLIC
                ){
                    System.out.println("自動調用方法:"+m.getName());
                    m.invoke(obj);
                }
            }

        }
    }
}
