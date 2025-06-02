//lab 2
import java.net.*;
public class GetterMethod{
    public static void main(String[] args){
        try{
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("host Name: " +address.getHostName());
            System.out.println("Canonical HOst Name:"+ address.getCanonicalHostName());
            System.out.println("host ip:" + address.getHostAddress());
            System.out.println("loop back address:" + address.isLoopbackAddress());
            System.out.println("is multicast address:"+ address.isMulticastAddress());
            System.out.println("is local address:" + address.isAnyLocalAddress());
            System.out.println("Is Link Local Address: " + address.isLinkLocalAddress());
            System.out.println("Is Site Local Address: " + address.isSiteLocalAddress());
        }catch(UnknownHostException e){
            System.err.println("unable to retrive");
            e.printStackTrace();
        }

    }
}