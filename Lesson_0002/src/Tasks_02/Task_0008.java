package Tasks_02;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0008 {
    public static void main(String[] args) {
        int array[]={10,9,1,2,4,7,5,6,3,8};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1) {
                sum+=array[i];
            }
        }
        System.out.println("Sum elements - "+ sum);
    }
}
