package Tasks_02;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0003 {
    public static void main(String[] args) {
        int array[]={10,9,1,2,4,7,5,6,3,8};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
