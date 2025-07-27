import java.net.*;

public class q31_client {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();

        String number = "7"; // test value, change if needed
        InetAddress serverAddress = InetAddress.getByName("localhost");
        byte[] sendData = number.getBytes();

        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 1111);
        socket.send(sendPacket);
        System.out.println("📤 Sent number to server: " + number);

        byte[] receiveBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
        socket.receive(receivePacket);

        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("✅ Server Response: " + response);

        socket.close();
    }
}
