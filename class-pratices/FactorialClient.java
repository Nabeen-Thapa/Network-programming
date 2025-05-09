import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

public class FactorialClient {
    public static void main(String[] args) throws IOException {
        String input = JOptionPane.showInputDialog("Enter a number:");
        int num = Integer.parseInt(input);
        Socket soc = new Socket("localhost", 34345);
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        DataInputStream in = new DataInputStream(soc.getInputStream());
        out.writeUTF(String.valueOf(num));
        out.flush();
        int fact = Integer.parseInt(in.readUTF());
        JOptionPane.showMessageDialog(null, "Factorial of " + num + " is: " + fact);
        soc.close();
    }
}
