package reflect;

import java.lang.reflect.Method;

public class ReflectDemo6 {
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
//        p.hehe();//編譯不通過，私有方法不可以被類的外部調用

        /*
            Class的方法:
            Method getMethod(String name,Class... cls)
            Method[] getMethods()
            上述兩個方法僅能獲取該類的公開方法(包括從超類繼承的方法)

            getDeclaredMethod()
            getDeclaredMethods()
            上述兩個方法可以獲取本類定義的方法(含有私有的，不含有繼承的)
         */

//        Method m = cls.getMethod("hehe");  // 無法訪問

//        Method[] methods = cls.getDeclaredMethods();
//        for(Method method:methods){
//            System.out.println(method.getName());
//        }

        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        Method m = cls.getDeclaredMethod("hehe");
        m.setAccessible(true);  // 強行打開訪問權限
        m.invoke(o);
        m.setAccessible(false);  // 對於私有成員，訪問後關閉(必須)


    }
}
