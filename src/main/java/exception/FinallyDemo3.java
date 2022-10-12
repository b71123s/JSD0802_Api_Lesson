package exception;

public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println(
           test("0")+","+test("")+","+test(null)
        );
    }
    public static int test(String str){
        try {
            return  str.charAt(0)-'0';
        }catch (StringIndexOutOfBoundsException e){
            return 1;
        }catch (NullPointerException e){
            return 2;
        }
        // 加上finally 後會 return 3,3,3 變量原先返回值0,1,2會被覆蓋
//        finally {
//            return 3;
//        }
    }
}
