import java.io.IOException;
import java.net.*;
import java.util.*;

public class q16 {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("http://example.com");
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("21.0.4.5", 8080));
        Set<URI> failed = new HashSet<>();

        ProxySelector.setDefault(new ProxySelector() {
            public List<Proxy> select(URI u) {
                return failed.contains(u) ? List.of(Proxy.NO_PROXY) : List.of(proxy);
            }
            public void connectFailed(URI u, SocketAddress sa, IOException e) {
                System.out.println("Failed: " + u);
                failed.add(u);
            }
        });

        for (int i = 1; i <= 2; i++) {
            System.out.println("Attempt " + i + ": " + ProxySelector.getDefault().select(uri));
            try {
                uri.toURL().openConnection().connect();
                System.out.println("Success!");
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
