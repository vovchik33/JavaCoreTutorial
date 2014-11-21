package Tasks_03;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0003 {
    public static void main(String[] args) {
        int[][] array2d = new int[10][10];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if ((j>=i && j<array2d.length-i) || (j<=i && j>=array2d.length-i-1)) array2d[i][j]= 1;
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
