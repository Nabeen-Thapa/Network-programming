import java.net.*;

public class q12 {
    public static void main(String[] args) {
        String[] protocols = {"http", "https", "ftp", "smtp", "file"};
        for (String protocol : protocols) {
            try {
                URL url = new URL(protocol, "example.com", "/");
                url.openConnection();
                System.out.println(protocol + " is supported.");
            } catch (Exception e) {
                System.out.println(protocol + " is NOT supported.");
            }
        }
    }
}
