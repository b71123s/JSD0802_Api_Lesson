package thread;

public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread(){
          public void run(){
              for (int i = 0; i < 10000; i++) {
                  System.out.println("min");
              }
          }
        };


        Thread max = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("max");
                }
            }
        };


        Thread norm = new Thread(){
            public void run(){
                for (int i = 0; i < 10000; i++) {
                    System.out.println("nor");
                }
            }
        };
//        min.setPriority(1);
        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        min.start();
        max.start();
        norm.start();

//        單一核心CPU會是準確的，但現在黑多都是多核心，多少有誤差
//        這裡已經是唯一可以干預調度器時間片地方了
    }
}
