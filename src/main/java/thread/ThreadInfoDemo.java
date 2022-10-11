package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();

        String name = main.getName();
        System.out.println("線程姓名: "+name);

        long id = main.getId();
        System.out.println("線程唯一表示: "+id);

        int priority = main.getPriority();
        System.out.println("線程優先級: "+priority);

        boolean isAlive = main.isAlive();
        boolean isDeamon = main.isDaemon();
        boolean isInterrupted = main.isInterrupted();
        System.out.println("是否活著: "+isAlive);
        System.out.println("是否為守護線程: "+ isDeamon);
        System.out.println("是否被中斷: "+isInterrupted);

    }
}
