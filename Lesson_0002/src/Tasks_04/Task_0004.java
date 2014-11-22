package Tasks_04;

import java.util.*;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0004 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*10));
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1==o2) return 0;
                return (o1<o2)?1:-1;
            }
        });
        System.out.println(Arrays.toString(list.toArray()));
    }
}
