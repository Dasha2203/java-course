package homework_7.doctor;

public class Dentist extends Doctor {
    Dentist(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void treat() {
        System.out.println("The method treat of dentist");
    }

    @Override
    public String toString() {
        return  "Dentist: " + this.getFullName();
    }
}
