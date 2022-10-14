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
            System.out.println("服務端啟動完畢!");
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
            }
//            InputStream in = socket.getInputStream();
//            InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
//            BufferedReader br = new BufferedReader(isr);
//            String message;
//            }
//
//            while ( (message = br.readLine()) != null ){
//                System.out.println("客戶端說: "+ message);
//            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
