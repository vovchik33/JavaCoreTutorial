package Tasks_01.Task_0002.pets;

/**
 * Created by vladimirkr on 11/24/2014.
 */
public class Snake extends Pet {
    public Snake() {
        System.out.println("Create Snake");
    }

    @Override
    public void voice() {
        System.out.println("S-s-s!");
    }
}
