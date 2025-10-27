package homework_9;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override
    public double getSquare() {
        double semiperimeter = getSemiPerimeter();

        return Math.sqrt(semiperimeter * (semiperimeter - this.a) * (semiperimeter - this.b) * (semiperimeter - this.c));
    }

    private double getSemiPerimeter() {
        return (this.a + this.b + this.c) / 2;
    }
}
