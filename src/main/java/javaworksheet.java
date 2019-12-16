import java.io.File;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.LinkedList;
import java.util.Queue;

public class javaworksheet {
    public static void main(String[] args) throws URISyntaxException,StringIndexOutOfBoundsException {
        System.out.println("### ------ This is a work sheet! --------######");

//            URL u = new URL("https://codegym.cc/testdata/secretPasswords.txt");
            String s = "/testdata/secretPasswords.txt";
            String s1 = s.substring(s.lastIndexOf("/")+1,s.indexOf("."));
            System.out.println("s1 is: " + s1);
        }
    }
