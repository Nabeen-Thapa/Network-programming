import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URI;
import java.net.URL; 
public class dwonloadWebPage {
    public static void main(String[] args){
       String ur="https://www.google.com";
        InputStream in = null;
        try {
            URL ul = new URL(ur);
            in= ul.openStream();
            in=new BufferedInputStream(in);
            Reader r = new InputStreamReader(in);
            int c;
            while ((c = r.read())!=-1) {
                System.out.print((char)c);
            }

        } catch (Exception e) {
            System.err.println(args[0] + "is not a parsable url");
        }finally{
            if(in != null){
                try {
                    in.close();
                } catch (Exception e) {
                   //ignore
                }
            }
        }
    }
}


