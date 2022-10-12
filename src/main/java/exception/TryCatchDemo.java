package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序開始");

        try {
//            String line = null;
//            String line = "";
            String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
//        }catch (NullPointerException e){
//            System.out.println("出現空指針異常");
//        }catch (StringIndexOutOfBoundsException e){
//            System.out.println("出現字符串異常，已維修");
//        }
        // 多異常合併處理
        }catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("統一處理");
        // 超類異常一定要在下面，且捕獲後不戶再補子類
        }catch (Exception e){
            System.out.println("就是出錯，這是超類異常");
        }

        System.out.println("程序結束");

    }
}
