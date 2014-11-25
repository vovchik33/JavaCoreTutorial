package Tasks_02.Task_0001;

import Tasks_02.Task_0001.presenters.GraphicPresenter;
import Tasks_02.Task_0001.presenters.TextPresenter;
import Tasks_02.Task_0001.shapes.Shape;

/**
 * Created by vladimirkr on 11/25/2014.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape(new GraphicPresenter());
        Shape shape2 = new Shape(new TextPresenter());
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}
