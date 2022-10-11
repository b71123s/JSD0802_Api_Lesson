package thread;

public class DeamonThreadDemo {
    public static void main(String[] args) {
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

        while (true);
    }
}
