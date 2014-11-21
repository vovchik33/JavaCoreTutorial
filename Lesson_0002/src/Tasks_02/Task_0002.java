package Tasks_02;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0002 {
    public static void main(String[] args) {
        int array[]={10,9,1,2,4,7,5,6,3,8};
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                System.out.println(array[i]);
            }
        }
    }
}
