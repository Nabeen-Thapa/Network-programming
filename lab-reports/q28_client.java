// TCPClient.java
import java.io.*;
import java.net.*;

public class q28_client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello from client");
        socket.close();
    }
}
