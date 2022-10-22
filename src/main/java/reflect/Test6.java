package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;


/**
 * 自动调用与当前类Test6在同一个包中被注解@AutoRunClass标注的类中
 * 那些被@AutoRunMethod标注的方法指定次(次数由注解@AutoRunMethod参数指定)
 */

public class Test6 {
    public static void main(String[] args) throws Exception{
        Class cls = Test6.class;
        String packageName = cls.getPackage().getName();
        File dir = new File(
                cls.getResource(".").toURI()
        );
        File[] subs = dir.listFiles(f->f.getName().endsWith(".class"));
        for(File sub : subs){
            String fileName = sub.getName();
            String className = fileName.substring(0,fileName.indexOf("."));
            className = packageName+"."+className;
            Class c = Class.forName(className);
            if(c.isAnnotationPresent(AutoRunClass.class)){
                System.out.println("實例化:"+className);
                Object o = c.newInstance();
                //获取该类中的所有方法
                Method[] methods = c.getDeclaredMethods();
                for(Method method : methods){
                    if(method.isAnnotationPresent(AutoRunMethod.class)){
                        AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                        int value = arm.value();
                        System.out.println("自動調用方法:"+method.getName()+"  "+value+"次");
                        for(int i=0;i<value;i++) {
                            method.invoke(o);
                        }
                    }
                }

            }

        }
    }
}
