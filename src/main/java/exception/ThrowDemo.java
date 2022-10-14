package exception;


public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();


        try {
            p.setAge(70000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }

        System.out.println("年齡" + p.getAge() + "歲");
    }
}
