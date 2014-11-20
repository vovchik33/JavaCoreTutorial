/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0010 {
    public static void main(String[] args) {
        String s="Hello, world!!!";
        String result="";

        for (int i = 0; i < s.length(); i++) {
            if (result.indexOf(s.charAt(i))<0) {
                result+=s.charAt(i);
            }
        }
        System.out.println(result);
    }
}
