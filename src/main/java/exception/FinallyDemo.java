package exception;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("程序開始了");
        try {
            String line = "";
            System.out.println(line.length());
            return;  // 先finally在return
        } catch (Exception e) {
            System.out.println("出錯了");
        } finally {
            System.out.println("finally塊輸出");
        }
        System.out.println("程序結束");

    }
}
