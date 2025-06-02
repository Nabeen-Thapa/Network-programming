//lab 6
import java.net.*;
public class IpMac{
    public static void main(String[] args){
       try{
         InetAddress host = InetAddress.getLocalHost();
        System.out.println("ip address:" + host.getHostAddress());
        NetworkInterface network = NetworkInterface.getByInetAddress(host);
            byte[] mac = network.getHardwareAddress();

            System.out.print("MAC Address: ");
            for (int i = 0; i < mac.length; i++) {
                System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
            }
       }catch(UnknownHostException | SocketException  e){
        e.printStackTrace();
       }

    }
}