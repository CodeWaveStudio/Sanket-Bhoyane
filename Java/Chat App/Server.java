import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    ServerSocket serverSocket;
    Socket socket;
    BufferedReader br;
    PrintWriter out;
    public Server(){
try {
    serverSocket=new ServerSocket(8888);
    System.out.println("Server Waiting.......");
    socket=serverSocket.accept();
   
    br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
    out=new PrintWriter(socket.getOutputStream());

    startReading();
    startWriting();
} catch (Exception e) {
    System.out.println("connection terminated.....");
}

    }
    public void startReading(){
    Runnable r1=()->{
        System.out.println("Reader Started...");
        try {
            while (true) {
                String msg=br.readLine();
                if (msg.equals("exit")) {
                   System.out.println("Client terminated the chat.");
                   socket.close();
                   break;
                }
                System.out.println("Client: "+msg);
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
                System.out.println("Connection CLose...");
            } catch (Exception e) {
               System.out.println("writer closed...");
            }
        };
    new Thread(r2).start();
    }
public static void main(String[] args) {
    new Server();
}
}