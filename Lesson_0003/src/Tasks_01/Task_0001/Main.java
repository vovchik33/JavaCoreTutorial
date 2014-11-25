package Tasks_01.Task_0001;

import Tasks_01.Task_0001.shapes.Circle;
import Tasks_01.Task_0001.shapes.Rectangle;
import Tasks_01.Task_0001.shapes.Shape;

/**
 * Created by vladimirkr on 11/24/2014.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        Circle circle=new Circle();

        circle.draw();
        rectangle.draw();
    }
}
