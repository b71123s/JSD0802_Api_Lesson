package reflect;
  // 也問題待找
import reflect.annotations.AutoRunMethod;

import java.lang.reflect.Method;

public class ReflectDemo10 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        if (cls.isAnnotationPresent(AutoRunMethod.class)){
            Method method = cls.getDeclaredMethod("read");
            if (method.isAnnotationPresent(AutoRunMethod.class)){
                /*
                    所有反射對像都支持方法:
                    Annotation getAnnotation(Class cls)
                    獲取cls類對象表示的註解
                 */
                //返回當前method對象表示的方法"watchTV"上的註解@AutoRunMethod
                AutoRunMethod arm = method.getAnnotation(AutoRunMethod.class);
                int value = arm.value();
                System.out.println("參數值"+value);
            }
        }

    }
}
