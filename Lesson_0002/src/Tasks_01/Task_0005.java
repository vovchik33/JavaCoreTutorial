package Tasks_01;

/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0005 {
    public static void main(String[] args) {
        String s="АННА, БАРАБАН НА"; //http://playroom.com.ru/perever.php
        String palindrom="";
        Boolean isPalindrom=true;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 32:
                case '.':
                case ',':
                case '!':
                case '?':
                    break;
                default:
                    palindrom += s.charAt(i);
            }
        }

        for (int i = 0; i < s.length() / 2; i++) {
            isPalindrom = (palindrom.charAt(i)==palindrom.charAt(palindrom.length()-i-1));
            if (!isPalindrom) break;
        }
        System.out.println(isPalindrom);
    }
}
