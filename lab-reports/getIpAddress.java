//lab 1
import java.net.InetAddress;
import java.net.UnknownHostException;
public class getIpAddress{
    public static void main(String[] args){
        try{
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("local ip address: "+ localhost.getHostAddress());
        }catch(UnknownHostException e){
            System.err.println("Unable to retrieve IP address.");
            e.printStackTrace();
        }
    }
}