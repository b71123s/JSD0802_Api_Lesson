package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * windows查看IP地址:
 * WIN+R后在输入框输入CMD
 * 弹出的命令行窗口输入:ipconfig查看
 * <p>
 * MAC查看IP地址:
 * 五个手指在触摸板上向中间聚拢,选择"终端"并打开.
 * 弹出的命令行窗口输入:/sbin/ifconfig查看
 * <p>
 * <p>
 * 聊天室服务端
 */
public class Server {
    /**
     * java.net.ServerSocket
     * 运行在服务端的ServerSocket主要任务:
     * 1:打开服务端口(客户端就是通过这个端口与服务端建立连接的)
     * 2:监听端口,等待客户端连接.
     */
    private ServerSocket serverSocket;

    //用来保存所有客户端的输出流
    private List<PrintWriter> allOut = new ArrayList<>();

    public Server() {
        try {
            /*
                创建ServeSocket时要指定服务端口,该端口不能与服务端所在
                计算机上其它应用程序开启的端口重复,否则会抛出异常:
                java.net.BindException:address already in use
                解决办法:
                1:更换端口,直到可用
                2:杀死使用该端口的进程(程序),仅在咱们重复启动服务端导致时使用
             */
            System.out.println("正在启动服务端...");
            serverSocket = new ServerSocket(8088);
            System.out.println("服务端启动完毕!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("等待客户端连接...");
                /*
                ServerSocket的accept方法用于等待客户端的连接.
                该方法是一个阻塞方法,直到一个客户端建立连接,此时该方法会立即
                返回一个Socket实例,使用该Socket实例即可与对方交互.
             */
                Socket socket = serverSocket.accept();
                System.out.println("一个客户端连接了!");
                //启动一个线程来处理与该客户端的交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 该线程任务负责与指定的客户端交互
     */
    private class ClientHandler implements Runnable{
        private Socket socket;
        private String host;//记录客户端的IP地址
        public ClientHandler(Socket socket){
            this.socket = socket;
            //通过socket获取远端计算机的地址信息(IP地址)
            host = socket.getInetAddress().getHostAddress();
        }

        public void run(){
            PrintWriter pw = null;
            try {
                //通过socket获取输入流读取来自远端计算机发送过来的数据
                InputStream in = socket.getInputStream();
                InputStreamReader isr
                        = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                //通过socket获取输出流用来将消息发送给远端计算机(客户端)
                OutputStream out = socket.getOutputStream();
                OutputStreamWriter osw
                        = new OutputStreamWriter(out,StandardCharsets.UTF_8);
                BufferedWriter bw = new BufferedWriter(osw);
                pw = new PrintWriter(bw,true);
                //将该输出流存入共享集合
                //将临界资源作为同步监视器对象
                synchronized (allOut) {
                    allOut.add(pw);
                }
                sendMessage(host+"上线了，当前在线人数:"+allOut.size());




                //读取一行来自远端计算机发送过来的字符串
                String message;
                /*
                    当我们调用br.readLine()读取来自远端计算机发送过来的一行字符串
                    时,远端计算机如果调用了socket.close()正常与我们断开连接,那么
                    readLine()方法会返回null.
                    如果客户端是异常中断(比如强制杀死进程),这里readLine方法会
                    抛出异常:
                    java.net.SocketException: Connection reset
                 */
                while ((message = br.readLine()) != null) {
                    System.out.println(host+"说:" + message);
                    sendMessage(host+"说:" + message);
                }
            } catch (IOException e) {
            } finally {
                //处理客户端断开链接后的操作
                //从allOut中将该客户端的输出流删除
                synchronized (allOut) {
                    allOut.remove(pw);
                }
                //广播下线通知
                sendMessage(host+"下线了，当前在线人数:"+allOut.size());
                //关闭socket释放资源
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //将消息广播给所有客户端
        private void sendMessage(String message){
            synchronized (allOut) {
                for (PrintWriter o : allOut) {
                    o.println(message);
                }
            }
        }
    }

}
