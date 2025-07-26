//lab 7

import java.net.*;
import java.util.*;

public class IPFromInterface {
    public static void main(String[] args) throws Exception{
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println("Interface Name: " + ni.getName());

                for (InterfaceAddress addr : ni.getInterfaceAddresses()) {
                    InetAddress ip = addr.getAddress();
                    if (ip != null) {
                        System.out.println("  IP Address: " + ip.getHostAddress());
                    }
                }
            }
    }
}
