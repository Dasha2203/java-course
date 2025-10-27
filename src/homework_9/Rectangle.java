package homework_9;

public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.a + 2 * this.b;
    }

    @Override
    public double getSquare() {
        return this.a * this.b;
    }
}
