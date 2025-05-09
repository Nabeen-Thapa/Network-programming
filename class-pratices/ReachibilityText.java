import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class ReachibilityText {
    public static void main(String[] args){
        try {
            //for single interface
            // String host= "basantachapagain.com.np";
            // InetAddress inet = InetAddress.getByName(host);
            // System.out.println(host);
            // if(inet.isReachable(5000)){
            //     System.out.println("richable");
            // }else{
            //     System.out.println("not");
            // }


            //multiple interface
            // InetAddress inet = InetAddress.getByName("8.8.8.8");
            // NetworkInterface networkInterface = null;
            // Enumeration<NetworkInterface> interfaces =  NetworkInterface.getNetworkInterfaces();
            // while (interfaces.hasMoreElements()) {
            //     NetworkInterface ni = interfaces.nextElement();
            //     System.out.println(ni +" -"+ ni.isUp());
            //     if(!ni.isLoopback() && ni.isUp()){
            //         networkInterface = ni;
            //         break;
            //     }
            // }

            // int ttl = 30;
            // int timeout = 5000;
            // boolean rechable = inet.isReachable(networkInterface, ttl, timeout);
            // System.out.println("eacheable :"+ rechable);


            //
            InetAddress domain1 = InetAddress.getByName("www.goole.com");
            InetAddress domain2 = InetAddress.getByName("www.drive.google.com");
            System.out.println(domain1.hashCode());
            System.out.println(domain1.toString());
            if(domain1.equals(domain2)){
                System.out.println("equals");
            }else{
                System.out.println(" not equals");
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
