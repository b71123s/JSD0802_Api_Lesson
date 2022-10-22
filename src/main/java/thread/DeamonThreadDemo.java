package thread;

public class DeamonThreadDemo {
    public static void main(String[] args) {
        // thread用匿名內部類重寫run方法
        Thread rose = new Thread(){
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("Rose: let me go!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("pu-tom~~~~");
            }
        };

        Thread jack = new Thread(){
            public void run(){
                while (true){
                    try {
                        Thread.sleep(1000);
                        System.out.println("Jack: you life i life!");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        rose.start();
        jack.setDaemon(true);
        jack.start();

        // 這句一加main線成就持續走，jack守護線程就不會被殺掉
        // 如果沒有普通線程了(沒有while)，守護現程就會被殺掉
        while (true);
    }
}
