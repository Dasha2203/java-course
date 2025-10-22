package homework_8.Animal;

public class Rabbit extends Animal{
    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Rabbit voice");
    }

    @Override
    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "grass":
                System.out.println("Rabbit is eating grass");
                break;
            default:
                System.out.println("Rabbit wasn't to eat this food");
                break;
        }
    }
}
