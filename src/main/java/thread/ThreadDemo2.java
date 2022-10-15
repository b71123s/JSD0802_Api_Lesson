package thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 實歷化任務
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();
        // 實歷化線程，並指派任務
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        // 線程啟動後，會自動調用run方法
        t1.start();
        t2.start();
    }
}

class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("你在看我嗎?");
        }
    }
}

// 改成實現接口，同時可以繼承其他類了，不一定要使用 Thread 時只能繼承
class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("可以再靠近一點");
        }
    }
}