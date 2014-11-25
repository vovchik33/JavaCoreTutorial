package Tasks_02.Task_0001.shapes;

import Tasks_02.Task_0001.presenters.Presenter;

/**
 * Created by vladimirkr on 11/25/2014.
 */
public class Shape {
    Presenter presenter;

    public Shape(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public String toString() {
        return "Shape{"+presenter.drawShape()+"}";
    }
}
