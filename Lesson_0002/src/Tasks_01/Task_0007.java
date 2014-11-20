package Tasks_01;

/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0007 {
    public static void main(String[] args) {
        String s="Hello, world";
        String vowel="aeouiAEOUI";

        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i))>=0) {
                System.out.print("_");
            } else {
                System.out.print(s.charAt(i));
            }
        }
    }
}
