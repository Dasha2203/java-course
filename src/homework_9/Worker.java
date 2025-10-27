package homework_9;

public class Worker  implements Employee{
    String position = "worker";

    public void printPosition() {
        System.out.println("Position: " + this.position);
    }
}
