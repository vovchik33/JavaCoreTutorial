/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0004 {
    public static void main(String[] args) {
        String s="Hello, world!!!";
        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.charAt(i)+""+s.charAt(i+1));
        }
    }
}
