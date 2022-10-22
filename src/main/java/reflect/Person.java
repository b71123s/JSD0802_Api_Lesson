package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

@AutoRunClass
public class Person {
    private String name = "張三";
    private int age = 23;

    public Person(){}
    public Person( String name, int age) {
        this.name = name;
        this.age = age;
    }

    @AutoRunMethod
    public void sayHi(){
        System.out.println("Say Hi!");
    }
    @AutoRunMethod(5)
    public void say(String name){
        System.out.println("Hi "+name);
    }
    @AutoRunMethod
    public void say(String name,int Count){
        for (int i = 0; i < Count; i++) {
            System.out.println(name+i+"次");
        }
    }
    public void eat(){
        System.out.println("吃飯ㄌㄚ~");
    }
    @AutoRunMethod(7)
    public void read(){
        System.out.println("讀書瞜~");
    }
    public void ride(){
        System.out.println("兜風去!");
    }

    @AutoRunMethod(8)
    public void sleep(){
        System.out.println("該睡了");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private void hehe(){
        System.out.println("我是Person類別的私有方法!!!");
    }

}
