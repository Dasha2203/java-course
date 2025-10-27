package homework_9.shapes;

public class Circle extends Shape implements Cloneable {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
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
