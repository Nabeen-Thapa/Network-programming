//lab 1
import java.net.InetAddress;
import java.net.UnknownHostException;
public class getIpAddress{
    public static void main(String[] args) throws UnknownHostException{
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("local ip address: "+ localhost.getHostAddress());    
    }
}