package Tasks_04;

import java.util.*;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0005 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random()*10));
        }
        System.out.println(Arrays.toString(list.toArray()));
        List<Integer> cloneList= (ArrayList) ((ArrayList)list).clone();
        Iterator<Integer> iterator=cloneList.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            if (value%2==1) iterator.remove();
        }

        System.out.println(Arrays.toString(cloneList.toArray()));
    }
}
