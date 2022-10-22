package reflect;

import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo9 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");

//        Method method = cls.getMethod("sayHi");
        Method method = cls.getMethod("read");
        if (method.isAnnotationPresent(AutoRunMethod.class)){
            System.out.println("被標註了!");
        }else {
            System.out.println("沒有被標註!");
        }
    }
}
