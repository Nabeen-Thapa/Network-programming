import java.net.*;
import java.io.*;
public class URISplitter {
    public static void main(String args[]) throws Exception {
        String[] sargs = {"tel:+1-800-9988-9938", 
                "http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc"};
        for (int i = 0; i < sargs.length; i++) {
            try {
                URI u = new URI(sargs[i]);
                System.out.println("The URI is " + u);
                if (u.isOpaque()) {
                    System.out.println("This is an opaque URI.");
                    System.out.println("The scheme is " + u.getScheme());
                    System.out.println("The scheme specific part is " + u.getSchemeSpecificPart());
                    System.out.println("The fragment ID is " + u.getFragment());
                }
    else {
                    System.out.println("This is a hierarchical URI.");
                    System.out.println("The scheme is " + u.getScheme());
                    try {
                        u = u.parseServerAuthority();
                        System.out.println("The host is " + u.getUserInfo());
                        System.out.println("The user info is " + u.getUserInfo());
                        System.out.println("The port is " + u.getPort());
                    } catch (URISyntaxException ex) {
                        // Must be a registry based authority
                        System.out.println("The authority is " + u.getAuthority());
                    }
                    System.out.println("The path is " + u.getPath());
                    System.out.println("The query string is " + u.getQuery());
                    System.out.println("The fragment ID is " + u.getFragment());
                } // end else 
            } // end try

            catch (URISyntaxException ex) {
                System.err.println(args[i] + " does not seem to be a URI.");
            }
            System.out.println();
        } // end for
    } // end main
} // end URISplitter
