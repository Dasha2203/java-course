package homework_9.shapes;

public abstract class Shape {
    public abstract double getSquare();
    public abstract double getPerimeter();

    public String toString() {
        return "\nФигура: " + this.getClass().getSimpleName() +
                "\nПлощадь: " + String.format("%.2f", getSquare()) +
                "\nПериметр: " + String.format("%.2f", getPerimeter());
    }
}
