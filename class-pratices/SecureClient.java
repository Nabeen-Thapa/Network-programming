import javax.net.ssl.*;
import java.io.*;
import java.net.URL;
import java.security.KeyStore;

public class SecureClient {

    public static void main(String[] args) throws Exception {
        SSLContext sslContext = SSLContextWithTrustStore.createSSLContext(
                "mykeystore.jks", "yourKeystorePassword",
                "mytruststore.jks", "yourTruststorePassword"
        );

        // Set the default context globally (optional)
        HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());

        URL url = new URL("https://localhost:8443");  // Make sure the server is running
        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
        connection.setDoOutput(true);

        // Send a request
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()))) {
            writer.write("hello\n");
            writer.flush();
        }

        // Read the response
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println("Server replied: " + response);
            }
        }
    }
}