import java.io.*;
import java.net.*;

public class q26_server {
   public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Echo server started...");
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(
            new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        String msg;
        while ((msg = in.readLine()) != null) {
            out.println("Echo: " + msg);
        }
        server.close();
    }
}
