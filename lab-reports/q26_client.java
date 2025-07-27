import java.io.*;
import java.net.*;

public class q26_client {
   public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        out.println("Hello Server");
        System.out.println(in.readLine());
        socket.close();
    }
}
