package Tasks_05;

import java.io.*;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0001 {
    public static void main(String[] args) throws IOException {
        File file = new File("./assets/Tasks_05/demo.html");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        String line=null;
        int counter=0;
        while((line = reader.readLine()) != null) {
            counter++;
            System.out.println(counter+". "+line);
        }
    }
}
