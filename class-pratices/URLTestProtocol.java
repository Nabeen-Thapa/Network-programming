import java.net.URI;
import java.net.URL; 
public class URLTestProtocol {

    private static void testProtocol(String url){
        try {
            //URI u = new URI(url); 
            //URL ul =new u.toURL();
            URL ul =new URI(url).toURL(); 
            System.out.println(ul.getProtocol()+ "is supported");
        }  catch (Exception e) {
            System.err.println("Invalid URI: " + e.getMessage());
        } 
    }
    public static void main(String[] args){
        testProtocol("http://www.audubon.org/");
        testProtocol("mailto://dibner.poly.edu/");
        testProtocol("gopher://anc.anc.org.za/");
    }
}