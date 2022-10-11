package thread;

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

class Shop{
    public void buy(){
        try {
            Thread t = Thread.currentThread();//获取运行buy方法的线程
            System.out.println(t.getName()+":正在挑衣服...");
            Thread.sleep(5000);

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