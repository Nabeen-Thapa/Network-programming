import java.io.*;
import java.net.*;
import java.util.Date;
import java.time.LocalDateTime;


public class q27_server {
     public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6000);
        Socket client = server.accept();
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println("Current time: " + LocalDateTime.now());
        server.close();
    }
}

