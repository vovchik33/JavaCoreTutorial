package Tasks_05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0004 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./assets/Tasks_05/demo.dat");
        Scanner scanner = new Scanner(file);
        List<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
