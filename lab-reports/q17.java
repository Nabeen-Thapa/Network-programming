import java.net.*;
import java.net.CookiePolicy;
import java.net.CookieManager;

public class q17 {
    public static void main(String[] args) {
        CookiePolicy policy = (uri, cookie) -> !uri.getHost().endsWith(".gov");
        CookieManager manager = new CookieManager(null, policy);
        CookieHandler.setDefault(manager);

        System.out.println("CookiePolicy set to block .gov domains.");
    }
}
