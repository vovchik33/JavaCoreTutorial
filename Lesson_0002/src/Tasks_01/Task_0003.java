package Tasks_01;

/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0003 {
    public static void main(String[] args) {
        String s="Hello, world!!!";
        int consonant=0;
        int vowel=0;
        int punctuation=0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'o':
                case 'e':
                case 'i':
                case 'u':
                case 'A':
                case 'O':
                case 'E':
                case 'I':
                case 'U':
                    vowel++;
                    break;
                case 13:
                case 10:
                case 32:
                    break;
                case '.':
                case ',':
                case '!':
                case '?':
                    punctuation++;
                    break;
                default:
                    consonant++;
            }
        }

        System.out.println("Consonant - "+consonant);
        System.out.println("Vowel - "+vowel);
        System.out.println("Other - "+punctuation);
    }
}
