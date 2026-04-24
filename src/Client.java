import java.io.*;
import java.net.*;
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 6000);

        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        DataInputStream  dis = new DataInputStream(socket.getInputStream());

        dos.writeInt(10);   // send first number
        dos.writeInt(20);   // send second number

        int result = dis.readInt();   // receive result from server
        System.out.println("Sum received from server: " + result);
        socket.close();
    }
}
