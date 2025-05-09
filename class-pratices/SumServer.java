import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SumServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(34345);
        System.out.println("Server is waiting for connection...");
        Socket s = ss.accept();
        System.out.println("Client connected.");

        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        int num1 = Integer.parseInt(in.readUTF());
        int num2 = Integer.parseInt(in.readUTF());
        int result = num1 + num2;
        
        out.writeInt(result); 
        out.flush();
        s.close();
        ss.close();
    }
}
