import java.net.*;
import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println("Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());
                System.out.println("Is Up: " + ni.isUp());
                System.out.println("Supports Multicast: " + ni.supportsMulticast());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
