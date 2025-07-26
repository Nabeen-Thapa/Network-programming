import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ChatClient {
    public static void main(String args[]) throws Exception {
        JFrame frame = new JFrame("Chat Client");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        frame.add(new JScrollPane(chatArea), BorderLayout.CENTER);
        
        JPanel inputPanel = new JPanel(new BorderLayout());
        JTextField inputField = new JTextField();
        JButton sendButton = new JButton("Send");
        inputPanel.add(inputField, BorderLayout.CENTER);
        inputPanel.add(sendButton, BorderLayout.EAST);
        frame.add(inputPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
        
        Socket sk = new Socket("127.0.0.1", 2000);
        BufferedReader sin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
        PrintStream sout = new PrintStream(sk.getOutputStream());
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText().trim();
                if (!message.isEmpty()) {
                    chatArea.append("Client: " + message + "\n");
                    sout.println(message);//send to sdrver
                    inputField.setText("");
                }
            }
        });
        
        new Thread(() -> {
            try {
                String s;
                while ((s = sin.readLine()) != null) {
                    chatArea.append("Server: " + s + "\n");
                    if (s.equalsIgnoreCase("BYE")) {
                        break;
                    }
                }
                sk.close();
            } catch (Exception e) {
                chatArea.append("Connection lost\n");
            }
        }).start();
    }
}
