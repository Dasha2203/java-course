package homework_8.Animal;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void voice() {
        System.out.println("Animal voice");
    }

    public void eat(String food) {
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAge: " + age;
    }
}
