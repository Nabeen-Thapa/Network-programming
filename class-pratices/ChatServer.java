import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        Socket sk = ss.accept();
        BufferedReader cin = new BufferedReader( new InputStreamReader(sk.getInputStream()));
        PrintStream cout = new PrintStream(sk.getOutputStream());
        BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in));
        String s;
        while (true) {
            s = cin.readLine();                             // Read message from client
            if (s.equalsIgnoreCase("END")) {                // If client says END, reply BYE and stop
                cout.println("BYE");
                break;
            }
            System.out.print("Client : " + s + "\n");       // Show client message
            System.out.print("Server : ");                 // Ask server user to reply
            s = stdin.readLine();
            cout.println(s);                               // Send reply to client
        }
        ss.close();
        sk.close();
        cin.close();
        cout.close();
        stdin.close();
    }
}
