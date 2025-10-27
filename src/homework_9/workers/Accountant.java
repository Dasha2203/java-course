package homework_9.workers;

public class Accountant implements Employee {
    String position = "Accountant";

    public void printPosition(){
        System.out.println("Position: " + this.position);
    }
}
