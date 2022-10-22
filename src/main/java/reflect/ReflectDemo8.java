package reflect;

import reflect.annotations.AutoRunClass;

public class ReflectDemo8 {
    public static void main(String[] args) throws Exception {
        /*
            常用的反射對象:
            Class,Method,Constructor,Field,Annotation
            都提供了一個方法:
            boolean isAnnotationPresent(Class cls)
            判斷當前反射對象表示的內容是否被cls所表示的註解標註了
         */
        Class cls = Class.forName("reflect.Person");

        // 判斷當前cls所表示的類Person是否被註解AutoRunClass標註了
        if (cls.isAnnotationPresent(AutoRunClass.class)){
            System.out.println("備標註了!");
        }else{
            System.out.println("沒有被標註!");
        }
    }
}
