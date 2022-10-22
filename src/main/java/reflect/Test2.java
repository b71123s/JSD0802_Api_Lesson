package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 自动调用Person类中所有本类定义的公开的无参的名字里含有字母'o'的方法
 * 提示:
 * Method类提供了方法:int getParameterCount()可以获取其表示的方法的参数个数
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            if(method.getParameterCount()==0 // 判断方法是否無參
                        &&
               method.getModifiers()== Modifier.PUBLIC  // 判断是否為公開方法
                        &&
               method.getName().contains("o")
            ){
                System.out.println("自動調用方法:"+method.getName());
                method.invoke(o);
            }
        }
    }
}
