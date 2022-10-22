package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.Class.forName;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person p = new Person();
        p.say("你好!");

        //實例化
        Class cls = forName("reflect.Person");
        Object o = cls.newInstance();

        //調用方法
        Method m =  cls.getMethod("say", String.class);
        m.invoke(o,"大家好!!");

        //invoke方法第二個參數開始為調用方法時傳遞的實際參數
        Method m2 = cls.getMethod("say", String.class ,int.class );
        m2.invoke(o,"嘿嘿",3);

    }
}
