package OOP.poly.dinamic;

import java.util.ArrayList;
import java.util.List;

public class DynamicPolyMain {

    public static void main(String[] args) {
        List<Shape> shapes=new ArrayList<>();
        shapes.add(new Circle(23));
        shapes.add(new Square(2));
        shapes.add(new Circle(3));

        for (Shape shape : shapes){
           shape.getArea();
        }

    }

}
