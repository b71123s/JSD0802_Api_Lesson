package exception;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<0 || age>100){
//            throw new RuntimeException("年齡不合法");
            throw new Exception("年齡不合法");
        }
        this.age = age;
    }
}
