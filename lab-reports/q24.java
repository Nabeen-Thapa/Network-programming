import java.io.*;
import java.net.*;

public class q24 {
    public static void main(String[] args) {
        try {
            // Step 1: Create URL object
            URL url = new URL("https://example.com");

            // Step 2: Open connection
            URLConnection connection = url.openConnection();

            // Step 3: Connect (optional)
            connection.connect();

            // Step 4: Read data from connection
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));

            String line;

            System.out.println("----- Web Page Content -----\n");

            // Step 5: Read and print to terminal
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

            System.out.println("\n----- End of Web Page -----");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
