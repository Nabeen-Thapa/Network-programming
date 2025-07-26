import java.net.*;

public class MACFromIP {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost(); 
            NetworkInterface ni = NetworkInterface.getByInetAddress(ip);
            byte[] mac = ni.getHardwareAddress();

            System.out.print("MAC Address: ");
            for (int i = 0; i < mac.length; i++) {
                System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
