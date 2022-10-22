package thread;

public class SyncDemo4 {
    public static void main(String[] args) {

        // 互斥鎖進階應用，把同類中的每個方法都鎖定，並都用同一個對象去調用
        // 就會發現一次只能執行一個方法，因為當他在執行此方法時對象會被鎖定，其他縣程要用此對象調用也是無法，只能等當前方法結束
        BOO boo = new BOO();
        Thread t1 = new Thread(){
          public void run(){
              boo.methodA();
          }
        };
        Thread t2 = new Thread(){
          public void run(){
              boo.methodB();
          }
        };
        Thread t3 = new Thread(){
            public void run(){
                boo.methodC();
            }
        };

        t1.start();
        t2.start();
        t3.start();

    }
}

class BOO{
    public synchronized void methodA(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"正在執行A訪方法...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+"方法A執行完畢!");
    }
    public synchronized void methodB(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"正在執行B方法...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+"方法B執行完畢!");
    }
    public synchronized void methodC(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"正在執行C方法...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+"方法C執行完畢!");
    }
}