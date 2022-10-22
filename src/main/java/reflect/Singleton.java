package reflect;

public class Singleton {
    // 1.實例一個方法
    private static Singleton instance = new Singleton();
    // 2.私有構造器
    private Singleton(){}
    // 3.提供調用方法
    public static Singleton getInstance() {
        return instance;
    }
}
