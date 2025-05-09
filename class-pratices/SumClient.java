import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JOptionPane;

public class SumClient {
    public static void main(String[] args) throws IOException {
        // Get input using dialog box
        String input1 = JOptionPane.showInputDialog("Enter the first number:");
        String input2 = JOptionPane.showInputDialog("Enter the second number:");

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        Socket soc = new Socket("localhost", 34345);
        DataOutputStream out = new DataOutputStream(soc.getOutputStream());
        DataInputStream in = new DataInputStream(soc.getInputStream());
        out.writeUTF(String.valueOf(num1));
        out.writeUTF(String.valueOf(num2));
        int result = in.readInt();
        JOptionPane.showMessageDialog(null, "Sum is: " + result);
        soc.close();
        out.flush();
    }
}
