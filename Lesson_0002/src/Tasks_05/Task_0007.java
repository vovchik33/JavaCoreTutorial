package Tasks_05;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0007 {
    public static void main(String[] args) {
        List<File> files=new ArrayList<File>();
        File file;
        file = new File("assets");
        files.add(file);
        int index=-1;
        while (index<files.size()-1) {
            index++;
            file = (File)files.get(index);

            if (file.isDirectory()) {
                System.out.println("Directory "+file.getAbsolutePath());
                for (File item:file.listFiles()) {
                    files.add(item);
                }
            } else {
                System.out.println("File "+file.getAbsolutePath());
            }
        }
    }
}
