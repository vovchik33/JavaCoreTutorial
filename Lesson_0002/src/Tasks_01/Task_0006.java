package Tasks_01;

/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0006 {
    public static void main(String[] args) {
        String s="Hello, world!!!";
        int step=3;
        for (int i = 0; i < s.length(); i+=step) {
            System.out.print(s.charAt(i));
        }
    }
}
