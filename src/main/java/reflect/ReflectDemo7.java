package reflect;

import java.lang.invoke.ConstantCallSite;
import java.lang.reflect.Constructor;

public class ReflectDemo7 {
    public static void main(String[] args) throws Exception {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        Class cls = Class.forName("reflect.Singleton");

        // 獲取私有的無參構造器
        Constructor c = cls.getDeclaredConstructor();
        c.setAccessible(true);
        Object o = c.newInstance();
        System.out.println("---單例被破防了---");
        System.out.println(o);
    }
}
