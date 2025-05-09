import java.net.InetAddress;
public class FIndLocalAddress{
    public static void main(String[] args){
       try{
            InetAddress address=InetAddress.getByName("192.168.56.1");
            System.out.println("address :" + address.getHostAddress());
            System.out.println("address :" + address.getHostName());
           System.out.println("address :" + address.getByName("192.168.56.1"));
            System.out.println("address :" + address.isAnyLocalAddress());
            InetAddress address2=InetAddress.getByName("127.0.0.1");
            System.out.println("address :" + address2.isLoopbackAddress());
            System.out.println("address :" + address.isLinkLocalAddress());
            System.out.println("address :" + address.isSiteLocalAddress());
            System.out.println("address :" + address.isMulticastAddress());
            System.out.println("address :" + address.isMCGlobal());
            System.out.println("address :" + address.isMCNodeLocal());
            System.out.println("address :" + address.isMCLinkLocal());



       }catch(Exception e){
                    System.out.println(e);

       }
        
    }
}