package sourcePackage;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileSelect fs = new FileSelect();

        System.out.println("Seznam souborů:");
        System.out.println(fs.listFiles("src/texts"));
        Reverse rv = new Reverse();
        rv.reverse();
        System.out.println(rv.reversed);
    }
}
