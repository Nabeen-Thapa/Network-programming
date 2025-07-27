import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class q23 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://httpbin.org/post"); // Using httpbin for testing POST requests
            URLConnection connection = url.openConnection();

            // Configuration
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestProperty("User-Agent", "JavaLabBot/1.0");
            connection.setDoOutput(true);

            // Sending POST data
            String postData = "name=Nabin&lab=23";
            try (OutputStream os = connection.getOutputStream()) {
                os.write(postData.getBytes());
                os.flush();
            }

            // Reading response
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                System.out.println("Server Response:");
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }
            }

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
