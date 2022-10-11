package thread;

public class SyncDemo___ng {
    public static void main(String[] args) {
        Thread t =Thread.currentThread();
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        Thread t1 = new Thread(){
            public void run(){
                f1.dosome();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                f2.dosome();
            }
        };
    }
}

class Foo{
    public synchronized static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"正在執行督商信方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+"執行督商信方法完畢");
    }
}
