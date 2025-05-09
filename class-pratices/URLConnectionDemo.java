
import java.net.*;
import java.io.*;
import java.util.Date;
public class URLConnectionDemo {
public static void main(String args[]) throws Exception {
int c;
URL hp = new URL("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3qECrJS28YC32yUyOqorD3TggXB8uDIfj2A&s+");
URLConnection hpCon = hp.openConnection();
// get date
long d = hpCon.getDate();
if (d == 0) {
System.out.println("No date information.");
} else {
System.out.println("Date: " + new Date(d));
}
// get content type
System.out.println("Content-Type: " + hpCon.getContentType());
// get expiration date
d = hpCon.getExpiration();
if (d == 0) { System.out.println("No last-modified information."); }
else { System.out.println("Last-Modified: " + new Date(d)); }
int len = hpCon.getContentLength(); // get content length
if (len == -1) {
System.out.println("Content length unavailable.");
} else { System.out.println("Content-Length: " + len); }
if (len >= 0) {
System.out.println("=== Content ===");
    try (InputStream input = hpCon.getInputStream()) {
        int i = len;
        while((c=input.read()) != -1) {
            System.out.print((char) c);
        }   }
}
else { System.out.println("No content available."); }
}
}
