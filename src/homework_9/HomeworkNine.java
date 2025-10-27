package homework_9;

import homework_9.shapes.Circle;
import homework_9.shapes.Triangle;
import homework_9.shapes.Rectangle;
import homework_9.shapes.Shape;

public class HomeworkNine {
    public static void main(String[] args) {
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

        System.out.printf("\nAmount of areas: %f", allAreas);
    }
}
