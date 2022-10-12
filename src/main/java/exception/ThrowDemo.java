package exception;

public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        // try裡面放有可能報錯語法，主動處理異常，報完仍然往下執行
        // 但若是try就只能被動往其他地方丟，丟到main裡面虛擬機會直接把你程序殺掉
        try {
            p.setAge(10000); // 滿足語法要求，但不滿足業務要求
        } catch (Exception e) {
            e.printStackTrace();
        }
//        p.setAge(24);
        System.out.println("此人年齡" + p.getAge() + "歲");
    }

}
