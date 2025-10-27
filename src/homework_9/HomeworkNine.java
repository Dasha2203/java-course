package homework_9;

import homework_9.shapes.Circle;
import homework_9.shapes.Triangle;
import homework_9.shapes.Rectangle;
import homework_9.shapes.Shape;

import java.util.SortedMap;

public class HomeworkNine {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape[] shapes = new Shape[] {
                new Circle(2),
                new Rectangle(4, 3),
                new Triangle(3, 5, 6),
                new Rectangle(2, 2),
                new Circle(10),
        };

        double allAreas = 0;

        for(Shape shape: shapes) {
            System.out.println(shape.toString());
            allAreas += shape.getPerimeter();
        }

        System.out.printf("\nAmount of areas: %f\n", allAreas);

        System.out.println("========== Clone ============");

        System.out.println("\n========== with clonable interface\n");

        Circle circle = new Circle(2);
        Circle clonedCircle = circle.clone();

        System.out.println(clonedCircle.toString());
        System.out.println(clonedCircle == circle);

        System.out.println("\n========== without clonable interface\n");
        Rectangle rectangle = new Rectangle(2, 2);
        Rectangle clonedRectangle = rectangle.clone();

        System.out.println(rectangle.toString());
        System.out.println(rectangle == clonedRectangle);


    }
}
