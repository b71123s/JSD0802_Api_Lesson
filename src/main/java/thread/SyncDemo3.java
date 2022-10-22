package thread;

public class SyncDemo3 {
    public static void main(String[] args) {

        // 演示當靜態方法調用synchronized時，一定會鎖(同步執行)
        FOO f1 = new FOO();
        FOO f2 = new FOO();

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

        t1.start();
        t2.start();

    }
}

class FOO{
    public static void dosome(){

        // 靜態方法內要調用同步塊，不能放this，因為只有成員方法有this
        // 要加只能加入類對象，固定寫法 "類名.class" ，後面會詳解
        synchronized (FOO.class){
            Thread t = Thread.currentThread();
            System.out.println(t.getName()+":正在執行督商信方法");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(t.getName()+"督商信方法執行完畢");
        }
    }
}
