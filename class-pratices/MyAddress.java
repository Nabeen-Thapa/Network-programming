import java.net.*;
public class MyAddress{
    public static void main(String[] args){
        try{
            InetAddress me = InetAddress.getLocalHost();
            int v4 = getVersion(me); 
            InetAddress aa = InetAddress.getByName("1050:0000:0000:0000:0005:0600:300c:326b");
            int v6 = getVersion(aa);

            String douttedQueted = me.getHostAddress();
            System.out.println(douttedQueted);
             System.out.println(v4);
            System.out.println(v6);
        }catch(UnknownHostException e){
            System.out.println(e);
        }
    }

    public static int getVersion(InetAddress ia){
       byte[] address = ia.getAddress();
       if(address.length == 4) return 4;
       else if(address.length ==16) return 6;
       else return -1;
    }
}