//lab 4
import java.net.*;

public class CheckVersion{
    public static void main(String[] args){
        try{
            InetAddress version4 = InetAddress.getLocalHost();
            int v4  = getVersion(version4);
            InetAddress version6 = InetAddress.getByName("3455::bac3:5453:bde3:3453:4567");
            int v6= getVersion(version6);
            System.out.println(version4 + " is v" + v4 + " address");
            System.out.println(version6 + " is v" + v6 + " address");
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }

    public static int getVersion(InetAddress ia){
        byte[] address = ia.getAddress();
        if(address.length == 4) return 4;
        if(address.length == 16) return 6;
        else return -1;
        
    }
}