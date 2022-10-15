package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    private ServerSocket serverSocket;
    public Server(){
        try {
            System.out.println("正在啟動服務端...");
            serverSocket = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            while(true){
                System.out.println("等待客戶端連接...");
                Socket socket = serverSocket.accept();
                System.out.println("一個客戶端連接了!");

                // 啟動一個線程來處理客戶端的交互，需要的socket在方法內加入構造方法傳過來
                ClientHandler handler = new ClientHandler(socket);
                System.out.println("已拿到socket");
                Thread t = new Thread(handler);
                t.start();
                System.out.println("已啟動客端交互線程");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    public class ClientHandler implements Runnable{
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {

            try {
                // 通過socket獲取輸入流讀取，來自遠端計算機發送的數據
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);
                String message;

                while ( (message = br.readLine()) != null ){
                    System.out.println("客戶端說: "+ message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
