package Tasks_05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0005 {
    public static void main(String[] args) throws IOException {
        File fileIn=new File("./assets/Tasks_05/demo.html");
        File fileOut=new File("./assets/Tasks_05/demo.tmp");
        fileOut.createNewFile();
        Scanner scanner = new Scanner(fileIn);
        PrintWriter writer=new PrintWriter(fileOut);
        int counter=0;
        while (scanner.hasNextLine()) {
            counter++;
            String line=scanner.nextLine();
            if (counter%2==1) {
                writer.println(line);
            }
        }
        scanner.close();
        writer.close();
    }
}
