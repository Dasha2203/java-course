package homework_7.doctor;

public class Surgeon extends Doctor {
    Surgeon(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void treat() {
        System.out.println("The method treat of surgeon");
    }

    @Override
    public String toString() {
        return  "Surgeon: " + this.getFullName();
    }
}
