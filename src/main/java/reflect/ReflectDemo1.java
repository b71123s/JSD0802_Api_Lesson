package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * JAVA反射機制
 * 反射是JAVA的動態機制，可以在程序【運行期間】再確定如:對象實例化，方法調用
 * 屬性操作等。
 * 反射機制可以大大的提高代碼的靈活度和可擴展性，但是隨之帶來的是較慢的運行
 * 效率和更多的系統開銷。因此不能過度依賴反射機制。
 */

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
/*
            Class類
            Class類的實例被稱為"類對象"。
            JVM在加載一個類的字節碼文件到內部時就會實例化一個Class實例
            與加載的類對應，用這個Class實例記錄加載的類的相關信息。並且
            在JVM內部每個被加載的類【都有且只有一個】類對象與之對應。

            獲取一個類的類對象方式有:
            1:類名.class
            Class cls = String.class;
            Class cls = int.class;

            2.Class.forName(String className)
              參數:類的完全限定名(包名.類名)
            Class cls = Class.forName("java.lang.String")

            3:使用ClassLoader加載

            4:對象.getClass()
         */
        //獲取String的類對象
//        Class cls = String.class;
//        Class cls = Person.class;

//        Class cls = Class.forName("java.lang.String");
//        Class cls = Class.forName("reflect.Person");
        /*
            java.lang.String
            java.util.HashMap
            java.util.ArrayList
            java.io.FileInputStream
            reflect.Person
         */

        Class cls = String.class;
        Class cls1 = Class.forName("reflect.Person");

        String name = cls.getName();
        System.out.println("類別全名: "+name);

        name = cls.getSimpleName();
        System.out.println("類別名稱: "+name);

/*
            Method類
            Method類的每一個實例稱為"方法對象"。
            該類的每個實例表示某個類中的一個方法。通過方法對像我們可以得知
            其表示的方法的相關信息，如:方法名，返回值類型，參數個數，參數類型
            等等。
         */
        /*
            Class中的方法:
            Method[] getMethods()
            獲取當前類對象所表示的類的所有公開方法
         */
        Method[] methods = cls.getMethods();
        System.out.println("String類別裡面方法個數: "+methods.length);

        for(Method method:methods){
            System.out.println("方法: "+method.getName());
        }

        // 輸入個類和方法，來調用此方法
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個類名: ");
        String className = scanner.nextLine();
        Class clss = Class.forName(className);

        String namee = clss.getName();
        System.out.println(namee);
        namee = cls.getSimpleName();
        System.out.println(namee);
    }
}
