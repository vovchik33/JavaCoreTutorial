package Tasks_04;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladimir V. Kravchenko on 21.11.2014.
 */
public class Task_0001 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*10));
        }

        for(Integer value:list) {
            System.out.println(value);
        }
    }
}
