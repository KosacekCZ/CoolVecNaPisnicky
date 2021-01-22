package sourcePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    FileSelect fs = new FileSelect();

    String path = "src/texts/" + fs.scanFile();
    File newFile = new File(path);
    String text = "";
    Scanner sc;

    {
        try {
            sc = new Scanner(newFile);

            while (sc.hasNextLine()) {
                text += sc.nextLine() + "\n";
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String verejnyText = text;

}

