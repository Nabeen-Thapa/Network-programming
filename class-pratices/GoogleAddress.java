import java.net.*;
public class GoogleAddress{
    public static void main(String args[]){
        try{
            // InetAddress address= InetAddress.getByName("www.goolge.com");
            //   InetAddress facebook= InetAddress.getByName("163.70.144.35");
            // System.out.println(address);
            //  System.out.println(facebook.getHostName());
            //  System.out.println(facebook.getHostAddress());
            // System.out.println(facebook.getCanonicalHostName());
            
             //get localhost details
            InetAddress localhost = InetAddress.getLocalHost();

            //print both system name and ip address
            System.out.println(localhost);
            //print system name
            System.out.println(localhost.getHostName());
            //print system address: ip address
            System.out.println(localhost.getHostAddress());
            System.out.println(localhost.getCanonicalHostName().toString());
        }catch(UnknownHostException e){
             System.out.println("error");
        }
    }

}