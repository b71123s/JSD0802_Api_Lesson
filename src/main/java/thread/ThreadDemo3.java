package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 1、匿名內部類創建線程
        Thread t1 =  new Thread(){
            public void run(){
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i+"、你好");
                }
            }
        };

        // 2、匿名內部類創建線程任務，並實現R接口
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i+"我好，大家好!!!");
                }
            }
        };

        // 3、匿名內部類創建線程任務，並實現R接口(lambda)
        // Runnable接口內有@FunctionalInterface註解，表示可使用lambda表達式
        // 涵式內部只有抽象方法才可lambda表達式
        Runnable r2 = ()->{
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i+"我好，大家好!!!");
                }
        };


        // 4、匿名內部類完整線程+任務創建
        // 如下，可將新增線程內裝Runnable的lambda更直觀
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                System.out.println(i+"我好，大家好!!!");
            }
        });
        // 原句
//        Thread t2 = new Thread(r2);

        t2.start();

    }
}

