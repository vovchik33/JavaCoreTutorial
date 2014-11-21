package Tasks_02;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0004 {
    public static void main(String[] args) {
        int array[]={10,9,1,2,4,7,5,6,3,8};
        for (int i = 0; i < array.length - 1; i++) {
            int max=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[max]>array[j]) {
                    max=j;
                }
            }
            int temp=array[i];
            array[i]=array[max];
            array[max] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
