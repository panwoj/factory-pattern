package factory;

import java.util.ArrayList;
import java.util.List;

public class FactoryApp {
    public static void main(String[] args) {

    ShapeFactory shapeFactory = new ShapeFactory();

    Shape shape1 = shapeFactory.makeShape("CIRCLE");
    Shape shape2 = shapeFactory.makeShape("RECTANGLE");
    Shape shape3 = shapeFactory.makeShape("SQUARE");

    List<Shape> shapeList = new ArrayList<>();
    shapeList.add(shape1);
    shapeList.add(shape2);
    shapeList.add(shape3);

    for(Shape shape : shapeList) {
        System.out.println(shape.getName() + ", field: " + shape.getField());
    }

    }
}
