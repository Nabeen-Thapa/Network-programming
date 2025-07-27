// TCPServer.java
import java.io.*;
import java.net.*;

public class q28_server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7000);
        System.out.println("Server ready to receive messages...");
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(
            new InputStreamReader(client.getInputStream()));
        String msg;
        while ((msg = in.readLine()) != null) {
            System.out.println("Received: " + msg);
        }
        server.close();
    }
}
