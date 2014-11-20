/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0009 {
    public static void main(String[] args) {
        String s="Hello, my dear world";
        int countWords=0;
        String currentWord="";
        String vowels="aoeuiAOEUI";
        for(int i=0; i<s.length(); i++) {
            switch (s.charAt(i)){
                case 10:
                case 13:
                case 32:
                case ',':
                case '.':
                case '!':
                case '?':
                    if (currentWord.length()>0) {
                        int countVowels=0;
                        for (int j = 0; j < currentWord.length(); j++) {
                            if (vowels.indexOf(currentWord.charAt(j))>=0) {
                                countVowels++;
                            }
                        }
                        if (countVowels>=2) countWords++;
                        System.out.println(currentWord);
                    }
                    currentWord = "";
                    break;
                default:
                    currentWord+=s.charAt(i);
                    break;
            }
        }
        if (currentWord.length()>0) {
            int countVowels=0;
            for (int j = 0; j < currentWord.length(); j++) {
                if (vowels.indexOf(currentWord.charAt(j))>=0) {
                    countVowels++;
                }
            }
            if (countVowels>=2) countWords++;
            System.out.println(currentWord);
        }
        System.out.println("Count Words - "+countWords);

    }
}
