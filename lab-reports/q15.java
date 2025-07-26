import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class q15  {
    public static void main(String args[]) throws UnsupportedEncodingException {
        String data = "http://www.code.com/?video=funny%20i%20am%20programmer.";
        String result = URLDecoder.decode(data, "UTF-8");
        System.out.println(result);
    }
}