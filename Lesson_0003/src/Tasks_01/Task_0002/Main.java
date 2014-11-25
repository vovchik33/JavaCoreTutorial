package Tasks_01.Task_0002;

import Tasks_01.Task_0002.pets.Cat;
import Tasks_01.Task_0002.pets.Dog;
import Tasks_01.Task_0002.pets.Snake;

/**
 * Created by vladimirkr on 11/24/2014.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        Snake snake= new Snake();

        cat.voice();
        dog.voice();
        snake.voice();
    }
}
