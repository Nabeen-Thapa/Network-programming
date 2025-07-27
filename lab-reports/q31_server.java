import java.net.*;

public class q31_server {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(1111);
        System.out.println("🔵 Server is running and waiting for UDP packets on port 1111...");

        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet); // wait for client
        System.out.println("📩 Packet received from client");

        String msg = new String(packet.getData(), 0, packet.getLength());
        System.out.println("📝 Number received: " + msg);

        int number = Integer.parseInt(msg);
        boolean isPrime = true;
        if (number <= 1) isPrime = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        String response = isPrime ? "Prime" : "Not Prime";
        System.out.println("📤 Sending response: " + response);

        InetAddress clientAddr = packet.getAddress();
        int port = packet.getPort();
        DatagramPacket reply = new DatagramPacket(response.getBytes(), response.length(), clientAddr, port);
        socket.send(reply);
        socket.close();
        System.out.println("✅ Server finished.");
    }
}
