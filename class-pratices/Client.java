// import java.io.*;
// import java.net.*;

// public class Client {
  
//     // Initialize socket and input/output streams
//     private Socket s = null;
//     private DataInputStream in = null;
//     private DataOutputStream out = null;

//     // Constructor to put IP address and port
//     public Client(String addr, int port)
//     {
//         // Establish a connection
//         try {
//             s = new Socket(addr, port);
//             System.out.println("Connected");

//             // Takes input from terminal
//             in = new DataInputStream(System.in);

//             // Sends output to the socket
//             out = new DataOutputStream(s.getOutputStream());
//         }
//         catch (UnknownHostException u) {
//             System.out.println(u);
//             return;
//         }
//         catch (IOException i) {
//             System.out.println(i);
//             return;
//         }

//         // String to read message from input
//         String m = "";

//         // Keep reading until "Over" is input
//         while (!m.equals("Over")) {
//             try {
//                 m = in.readLine();
//                 out.writeUTF(m);
//             }
//             catch (IOException i) {
//                 System.out.println(i);
//             }
//         }
//         System.out.println("Thank you");

//         // Close the connection
//         try {
//             in.close();
//             out.close();
//             s.close();
//         }
//         catch (IOException i) {
//             System.out.println(i);
//         }
//     }

//     public static void main(String[] args) {
//         Client c = new Client("127.0.0.1", 7000);
// //        Client c = new Client("http://www.google.com", 80);
//     }
// }






import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) throws Exception {
    try {
    Socket socket = new Socket("127.0.0.1",2020);
    System.out.println("Successful connection to the server.");
    
    // I/O streams
    BufferedReader in_socket = new BufferedReader (new InputStreamReader (socket.getInputStream()));
    PrintWriter out_socket = new PrintWriter (new OutputStreamWriter (socket.getOutputStream()), true);
    Scanner keyboard = new Scanner (System.in);

    String message = in_socket.readLine();
    System.out.println("Server says: " + message);
    message = keyboard.nextLine();
    out_socket.println(message);
    
    socket.close();
    System.out.println("Socket closed.");
    
  } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
