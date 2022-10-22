package thread;

import io.User;

/**
 * 同步块
 * 同步块可以更准确的锁定需要多个线程同步执行的代码片段,有效的缩小同步范围
 * 可以在保证并发安全的前提下尽可能的提高并发效率.
 * 语法:
 * synchronized(同步监视器对象){
 *     需要同步执行的代码片段
 * }
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread("范传奇"){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread("王克晶"){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();
    }
}

/**
 *  在方法上加synchronized，他預設一定是調用this是隱性的，不可改
 */

class Shop{
    public void buy(){
        try {
            Thread t = Thread.currentThread();//获取运行buy方法的线程
            System.out.println(t.getName()+":正在挑衣服...");
            Thread.sleep(5000);

            // 同步鎖，用來鎖更小範圍，鎖太大在方法上會沒效率，()內可寫任何引用類型的實例化對象
            synchronized(this){
                System.out.println(t.getName()+":正在试衣间试衣服...");
                Thread.sleep(5000);
            }


            System.out.println(t.getName()+":结账离开");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


// 鎖的使用要滿足兩個條件:
// 1. ()內必須放引用類型的實例
// 2. 兩個同步執行該代碼片段的線程，看到的必須是同一個同步監視器的物件

        // 一、無效鎖對象，兩個線程一進來看到new Object都會創建一個新的Object物件，所以他們看到的是不同物件
//        synchronized( new Object ){...}

        // 二、無效鎖對象，兩個線程一來方法都會執行t，雖變數同但線程不同，所以無效
//        synchronized( t ){...}

        // 三、無效鎖對象，t1的this是shop1，t2的this是shop2，兩間不同店，所以沒衝突
//        public public static void main(String[] args) {
//            Shop shop1 = new Shop();
//            Shop shop2 = new Shop();
//        }
//        Thread t1 = new Thread("范传奇"){ ... shop1.buy(); ... };
//        Thread t2 = new Thread("王克晶"){ ... shop2.buy(); ... };
//        synchronized( this ){...}

        // 四、有效鎖對象，但不合適，沿用案例三，兩間不同店，應該不衝突，但這邊卻會被鎖起來
        // 因為用字面量定義的字符串，全局只有一個，會緩存在常量池，所以不管哪個線程來，他看到都是同一個變量
//        synchronized( "abc" ){...}

