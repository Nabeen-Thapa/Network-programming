import java.io.*;
import java.net.*;

public class q27_client {
     public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6000);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
        socket.close();
    }
}
