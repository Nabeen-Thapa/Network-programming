import java.net.URI;
import java.net.URISyntaxException;

public class absoluteRelative {
    public static void main(String args[]) {
        try {
            URI top = new URI("javafaq/books/");
            URI relative = new URI("jnp3/examples/07/index-network-dev-java-programming-language.htmlgz");
            URI resolved = top.resolve(relative);
            System.out.println(resolved);
            URI absolute = new URI("http://www.example.com/");
            URI relative1 = new URI("images/logo.png");
            URI resolved1 = absolute.resolve(relative1);
            System.out.println(resolved1);

            URI absolute2 = new URI("http://www.example.com/");
            URI resolved2 = absolute2.resolve("images/logo.png");
            URI top1 = new URI("javafaq/books/");
            resolved2 = top1.resolve("jnp3/examples/07/index-network-dev-java-programming-language.html.gz");
            System.out.println(resolved2);

            URI absolute3 = new URI("http://www.example.com/images/logo.png");
            URI top3 = new URI("http://www.example.com/");
            URI relative3 = top3.relativize(absolute3);
            System.out.println(relative3);
        } catch (URISyntaxException e) {
            System.out.println(e);
        }

    }

}