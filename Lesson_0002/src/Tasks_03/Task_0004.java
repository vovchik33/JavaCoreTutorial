package Tasks_03;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0004 {
    public static void main(String[] args) {
        int numRows=6;
        int numCols=10;
        int[][] array2d=new int[numRows][numCols];
        int counter=0;

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i%2==1) {
                    array2d[i][array2d[i].length-j-1] = counter;
                } else {
                    array2d[i][j] = counter;
                }
                counter++;
            }
        }

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
