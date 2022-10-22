package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Student {

    @AutoRunMethod
    public void study(){
        System.out.println("學生:good good study,day day up!");
    }

    @AutoRunMethod
    public void playGame(){
        System.out.println("學生:玩遊戲");
    }
}