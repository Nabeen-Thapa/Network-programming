import java.net.*;

public class q25 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("google.com", 80);
            System.out.println("Local Port: " + socket.getLocalPort());
            System.out.println("Remote Port: " + socket.getPort());
            System.out.println("Remote Address: " + socket.getInetAddress());
            System.out.println("Is Connected: " + socket.isConnected());
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
