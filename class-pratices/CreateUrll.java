import java.net.*;

public class CreateUrll {
    public static void main(String[] args) {
        try {
            URI u = new URI("http://www.audubon.org/"); 
            URL ul = u.toURL(); 
            System.out.println(ul.toString()); 
        } catch (URISyntaxException e) {
            System.err.println("Invalid URI: " + e.getMessage());
        } catch (MalformedURLException e){ 
            System.err.println("Invalid URL: " + e.getMessage());
        }
    }
}
