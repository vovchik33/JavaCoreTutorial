package Tasks_01;

/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0008 {
    public static void main(String[] args) {
        String s="Heeeeeeello, worlllld!!!";
        int countRepeats=0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i)!=s.charAt(j)) {
                    if (i+1<j) countRepeats++;
                    i=j-1;
                    break;
                }
            }
        }
        System.out.println("Count Repeats - "+countRepeats);
    }
}
