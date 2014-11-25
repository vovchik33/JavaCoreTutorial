package Tasks_01.Task_0002.pets;

/**
 * Created by vladimirkr on 11/24/2014.
 */
abstract class Pet {
    protected Pet() {
        System.out.println("Create Pet");
    }

    abstract public void voice();
}
