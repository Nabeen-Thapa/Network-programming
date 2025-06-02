//lab 3

import java.net.*;

public class AddressType{
        public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getLocalHost();
        
            // Display basic information
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("IP Address: " + address.getHostAddress());

            // Display address characteristics
            System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
            System.out.println("Is Link Local Address: " + address.isLinkLocalAddress());
            System.out.println("Is Loopback Address: " + address.isLoopbackAddress());
            System.out.println("Is Multicast Address: " + address.isMulticastAddress());
            System.out.println("Is Site Local Address: " + address.isSiteLocalAddress());
        }catch(UnknownHostException e){
            System.out.println(e);
        }
    }

}