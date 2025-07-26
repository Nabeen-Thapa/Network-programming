import java.net.*;
import java.io.*;

public class Server {
   public static void main(String[] args) {

        try {
          ServerSocket  ss = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");

          Socket  s = ss.accept();
            System.out.println("Client accepted");

           DataInputStream in = new DataInputStream(new BufferedInputStream(s.getInputStream()));

            String m = "";

            while (!m.equals("Over")) {
                try {
                    m = in.readUTF();
                    System.out.println(m);

                } catch (IOException i) {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            s.close();
            in.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    
}