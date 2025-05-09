import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketInfo {
    public static void main(String[] args) {
        try {
            Socket thesocket = new Socket("localhost", 80);
            System.out.println("Connected to  " + thesocket.getInetAddress() + " on port " + thesocket.getPort() +
                    " from p ort " + thesocket.getLocalPort() + " of " + thesocket.getLocalAddress() + "\n");
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}