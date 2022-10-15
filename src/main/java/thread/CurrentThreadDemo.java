package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("主線程: " + main);
        dosome();

        Thread t3 = new MyThread3();
        Thread t4 = new MyThread4();
        System.out.println(t3);
        System.out.println(t4);
    }

    public static  void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("執行督商信方法是:"+t);
    }

}

class MyThread3 extends Thread{
    public void run(){
        System.out.println(currentThread());
    }
}

class MyThread4 extends Thread{
    public void run(){
        System.out.println(currentThread());
    }
}