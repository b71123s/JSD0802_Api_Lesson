package reflect;

import java.util.Scanner;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
/*
            反射機制進行實例化的步驟:
            1:加載要實例化對象的類的類對象
            2:直接通過類對象的方法newInstance()實例化
         */
//        Class cls = Class.forName("reflect.Person");
        /*
            java.util.ArrayList     java.util.HashMap
            reflect.Person          java.util.Date
         */
        Scanner scn = new Scanner(System.in);  // 動態寫活，拿到字符串再決定new哪個
        System.out.println("請輸入一個類的全稱: ");
        String c =  scn.nextLine();
        Class cls = Class.forName(c);
        // newInstance()方法會調用類對象所表示的類的【公開的無參構造器】實例化
        Object o = cls.newInstance();
        System.out.println(o);
    }
}
