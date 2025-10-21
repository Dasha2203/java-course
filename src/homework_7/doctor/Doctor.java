package homework_7.doctor;

public abstract class Doctor {
    private String name;
    private String lastName;

    Doctor(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void treat() {
        System.out.println("This is a common treat of Doctor class");
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.name + " " + this.lastName;
    }

    @Override
    public String toString() {
        return  "Doctor: " + this.getFullName();
    }
}
