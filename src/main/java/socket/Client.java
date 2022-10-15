package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {

    private Socket socket;

    public Client(){
        try {
            System.out.println("正在連接服務端...");
            socket = new Socket("localhost",8088);
            System.out.println("與服務端建立連接成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw,true);
            Scanner scn = new Scanner(System.in);

            while (true){
                System.out.println("請發送訊息: ");
                String line = scn.nextLine();
                if ("exit".equals(line)){
                    break;
                }
                pw.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
