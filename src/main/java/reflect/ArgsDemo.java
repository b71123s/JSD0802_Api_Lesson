package reflect;

public class ArgsDemo {
    public static void main(String[] args) {
        dosome();
        dosome("1","1");
        dosome("1","1","1","1");
    }

//        編譯後，所有參數都為數組元素
//        dosome(new String[]{});
//        dosome(new String[]{"1"});
//        dosome(new String[]{"1","2"});
//        dosome(new String[]{"1","2","2","2","2","2","2","2","2","2","2","2","2"});

    //    public static void dosome(String[] s){//編譯後可變長參數為數組類型
    /*
        可變長參數的要求是:必須為一個方法的最後一個參數，若有兩個參一般參數要放前面
     */
    public static void dosome(String... s){

    }
}
