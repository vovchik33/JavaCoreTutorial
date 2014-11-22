package Tasks_05;

import java.io.File;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0006 {
    public static void main(String[] args) {
        File file = new File("assets");
        if (file.isDirectory()) {
            readDirectory(file);
        }
    }

    public static void readDirectory(File file) {
        System.out.println("Directory "+file.getAbsolutePath());
        for (File item:file.listFiles()) {
            if (item.isDirectory()) {
                readDirectory(item);
            } else {
                System.out.println("File "+item.getAbsolutePath());
            }
        }
    }
}
