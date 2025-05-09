
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class HeaderViewer {

  public static void main(String args[]) throws Exception {

    URL u = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3qECrJS28YC32yUyOqorD3TggXB8uDIfj2A&s");
    URLConnection uc = u.openConnection();
    System.out.println("Content-type: " + uc.getContentType());
    System.out.println("Content-encoding: " + uc.getContentEncoding());
    System.out.println("Date: " + new Date(uc.getDate()));
    System.out.println("Last modified: " + new Date(uc.getLastModified()));
    System.out.println("Expiration date: " + new Date(uc.getExpiration()));
    System.out.println("Content-length: " + uc.getContentLength());
  }

}