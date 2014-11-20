/**
 * Created by vladimirkr on 11/20/2014.
 */
public class Task_0002 {
    public static void main(String[] args) {
        String s="Hello, my dear world!!!";
        for(int i=0; i<s.length(); i++) {
            switch (s.charAt(i)){
                case 10:
                case 13:
                case 32:
                    System.out.println("");
                    break;
                default:
                    System.out.print(s.charAt(i));
                    break;
            }
        }
    }
}
