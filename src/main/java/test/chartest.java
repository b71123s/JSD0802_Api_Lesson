package test;

public class chartest {
    public static void main(String[] args) {
        int d = 01100001; // 這裡這會被定義成二進制1001000000000000001，會輸出十進制294913
//        d = 97;
        System.out.println(d);  // 輸出會改為十進制294913
        char c = (char) d;
        System.out.println(c);
    }

}
