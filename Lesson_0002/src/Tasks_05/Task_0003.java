package Tasks_05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0003 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./assets/Tasks_05/demo.html");
        Scanner scanner = new Scanner(file);
        int counter=0;
        while(scanner.hasNext()) {
            counter++;
            System.out.println(counter+". "+scanner.next());
        }
    }
}
