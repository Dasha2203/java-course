package homework_9.shapes;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
