package Tasks_01;

/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0011 {
    public static void main(String[] args) {
        String s = "Hello, world!!!";
        String uniqueChars = "";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (uniqueChars.indexOf(s.charAt(i)) < 0) {
                uniqueChars += s.charAt(i);
            } else {
                if (result.indexOf(s.charAt(i))<0) {
                    result += s.charAt(i);
                }
            }
        }
        System.out.println(result);
    }
}
