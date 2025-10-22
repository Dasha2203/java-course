package homework_8.Animal;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Dog voice");
    }

    @Override
    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "meat":
                System.out.println("Dog is eating meat");
                break;
            default:
                System.out.println("Dog wasn't to eat this food");
                break;
        }
    }
}
