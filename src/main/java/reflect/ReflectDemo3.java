package reflect;

import java.lang.reflect.Constructor;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("李四",22);
        System.out.println(p);

        // 加載類對象
        Class cls = Class.forName("reflect.Person");

        // 調用無參構造器
//        Constructor con = cls.getConstructor();

        // 調用有參構造器
        Constructor con = cls.getConstructor(String.class,int.class);
        Object o = con.newInstance("阿三",33);
        System.out.println(o);



    }
}
