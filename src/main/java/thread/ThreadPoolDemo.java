package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 創建線程池
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        // 指派任務
        for (int i = 0; i < 5; i++) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName()+"正在執行一個任務...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(t.getName()+":執行任務完畢!!!");
                }
            };
            threadPool.execute(r);
            System.out.println(i+"將任務交給線程池!");
        }
        // 調完後，會執行完最後線程任務才結束
//        threadPool.shutdown();
        // 調的當下就中斷線程池
//        threadPool.shutdownNow();
        System.out.println("線程池關閉了");
    }
}
