//lab 5
import java.net.*;
import java.util.*;

public class SystemInterfaces{
    public static void main(String[] args){
        try{
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
            NetworkInterface netInterface = interfaces.nextElement();
             System.out.println("Interface Name: " + netInterface.getName());
            }
        }catch(SocketException e){
            e.printStackTrace();
        }
    }
}