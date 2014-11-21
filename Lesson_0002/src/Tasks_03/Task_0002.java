package Tasks_03;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0002 {
    public static void main(String[] args) {
        int[][] array2d = new int[11][11];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i==j) array2d[i][j]= 1;
            }
        }
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i+j+1==array2d.length) array2d[i][j]= 1;
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
