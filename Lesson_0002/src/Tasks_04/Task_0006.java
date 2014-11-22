package Tasks_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0006 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*10));
        }
        System.out.println(Arrays.deepToString(list.toArray()));
        Collections.reverse(list);
        System.out.println(Arrays.deepToString(list.toArray()));
    }
}
