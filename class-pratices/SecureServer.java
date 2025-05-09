import javax.net.ssl.*;
import java.io.*;
import java.net.ServerSocket;
import java.security.KeyStore;

public class SecureServer {

    public static SSLServerSocket createServerSocket(SSLContext sslContext, int port) throws IOException {
        SSLServerSocketFactory factory = sslContext.getServerSocketFactory();
        return (SSLServerSocket) factory.createServerSocket(port);
    }

    public static void main(String[] args) throws Exception {
        SSLContext sslContext = SSLContextWithTrustStore.createSSLContext(
                "mykeystore.jks", "yourKeystorePassword",
                "mytruststore.jks", "yourTruststorePassword"
        );

        SSLServerSocket serverSocket = createServerSocket(sslContext, 8443);
        System.out.println("Secure server started on port 8443...");

        while (true) {
            try (SSLSocket client = (SSLSocket) serverSocket.accept()) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println("Received: " + line);
                    writer.write("Echo: " + line + "\n");
                    writer.flush();
                    if (line.equalsIgnoreCase("bye")) break;
                }
            }
        }
    }
}