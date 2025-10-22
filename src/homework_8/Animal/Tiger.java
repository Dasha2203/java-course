package homework_8.Animal;

public class Tiger extends Animal {
    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println("Tiger voice");
    }

    @Override
    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "meat":
                System.out.println("Tiger is eating meat");
                break;
            case "live chicken":
                System.out.println("Tiger is eating live chicken");
                break;
            default:
                System.out.println("Tiger wasn't to eat this food");
                break;
        }
    }
}
