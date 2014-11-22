package Tasks_02;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * Created by Vladimir V. Kravchenko on 22.11.2014.
 */
public class Task_0009 {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array.toString());
        System.out.println(Arrays.toString(array));
        //System.out.println(StringUtils.join(Arrays.asList(array), ",")); //работает только для массива строк
    }
}
