package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 使用反射機制調用方法
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.eat();

        //實例化
//        Class cls = Class.forName("reflect.Person");
//        Object o = cls.newInstance();//Person p = new Person();
        //調用方法
//        Method method = cls.getMethod("eat");//獲取名為"eat"的無參方法
//        method.invoke(o);//執行eat方法  p.eat()

        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入類名: ");
        String className = scn.nextLine();
        System.out.println("請輸入方法名: ");
        String methodName = scn.nextLine();

        Class cls = Class.forName(className);
        Object o = cls.newInstance();

        Method method = cls.getMethod(methodName);
        method.invoke(o);
    }



}
