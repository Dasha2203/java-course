package homework_9;


public class Director implements Employee {
    String position = "Director";

    public void printPosition() {
        System.out.println("Position: " + this.position);
    }
}
