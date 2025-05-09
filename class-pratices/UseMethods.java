import java.net.*;
import java.io.*;
public class UseMethods {
    public static void main(String[] args) {
        try {
            String u = "https://www.google.com/";
            System.out.println("url :" + u.toString());
            System.out.println("port :" + u.getPort());
            System.out.println("protocol :" + u.getProtocol());
            System.out.println("file :" + u.getFile());
            System.out.println("authority :" + u.getAuthority());
            System.out.println("query :" + u.getQuery());

        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
}