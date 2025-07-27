import java.net.*;
import java.io.*;

public class q24 {
    public static void main(String[] args) {
        try {
            URLConnection conn = new URL("http://example.com").openConnection();
            BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "UTF-8"));

            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
