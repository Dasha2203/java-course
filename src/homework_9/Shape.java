package homework_9;

abstract class Shape {
    public abstract double getSquare();
    public abstract double getPerimeter();

    public String toString() {
        return "Фигура: " + this.getClass().getSimpleName() +
                "Площадь: " + String.format("%.2f", getSquare()) +
                "Периметр: " + String.format("%.2f", getPerimeter());
    }
}
