import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class javaworksheet {
    public static void main(String[] args) {
        System.out.println("### ------ This is a work sheet! --------######");
        File file = new File("C:\\Users\\AF82152\\Documents");
        Queue<File> fileQueue = new LinkedList<>();
        fileQueue.add(file);
        for(File f : fileQueue.poll().listFiles())
        {
            System.out.println(f);
        }
    }
}
