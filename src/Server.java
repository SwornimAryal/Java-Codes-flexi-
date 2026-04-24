import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(6000);
        System.out.println("Server waiting for client...");

        Socket socket = serverSocket.accept();          // accept client connection
        System.out.println("Client connected.");
        
        DataInputStream  dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        int num1 = dis.readInt();                       // receive first number
        int num2 = dis.readInt();                       // receive second number
        int sum  = num1 + num2;                         // add them
        System.out.println("Sum = " + sum);

        dos.writeInt(sum);                              // send result back

        socket.close();
        serverSocket.close();
    }
}
