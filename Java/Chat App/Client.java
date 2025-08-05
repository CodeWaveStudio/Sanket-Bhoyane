import java.io.*;
import java.net.*;

public class Client {

    Socket socket;
    BufferedReader br;
    PrintWriter out;
    public Client(){
        try {
            socket=new Socket("127.0.0.1",8888);
            System.out.println("client connected....");
            br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(socket.getOutputStream());

            startReading();
            startWriting();
        } catch (Exception e) {
           System.out.println("client connection terminated....");
        }
    }
    public void startReading(){
        Runnable r1=()->{
            System.out.println("Reader Started...");
            try {
                while (true) {
                    String msg=br.readLine();
                    if (msg.equals("exit")) {
                      System.out.println("Server Terminated the chat...");
                        socket.close();
                        break;
                    }
                    System.out.println("Server: "+msg);
                }
            } catch (Exception e) {
                System.out.println("reader closed...");
            }
        };
        new Thread(r1).start();
    }
    public void startWriting(){
        Runnable r2=()->{
            System.out.println("Writer STarted...");
            try {
                while (!socket.isClosed()) {
                    BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
               String content=br1.readLine();
              out.println(content);
              out.flush();
               if(content.equals("exit")){
               socket.close();
                break;
               }
                }
                System.out.println("Connection closed......");
            } catch (Exception e) {
               System.out.println("writer closed...");
            }
        };
        new Thread(r2).start();
    }
  public static void main(String[] args) {
    new Client();
  }
}
