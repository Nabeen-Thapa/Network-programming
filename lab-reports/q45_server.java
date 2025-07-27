import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class q45_server {
    public static void main(String[] args) {
        try {
            q45_implementation obj = new q45_implementation();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("GCDService", obj);
            System.out.println("GCD Server is ready.");
        } catch (Exception e) {
            System.out.println("Server Exception: " + e);
        }
    }
}
