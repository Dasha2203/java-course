package homework_8.Animal;

public class DogStatic {
    private String name;
    private int age;

    private DogStatic(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static DogStatic createDog(String name, int age) {
        return new DogStatic(name, age);
    }

    public void voice() {
        System.out.println("DogStatic voice");
    }

    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "meat":
                System.out.println("DogStatic is eating meat");
                break;
            default:
                System.out.println("DogStatic wasn't to eat this food");
                break;
        }
    }

    public static void staticVoice() {
        System.out.println("DogStatic voice");
    }

    public static void staticEat(String food) {
        switch (food.toLowerCase()) {
            case "meat":
                System.out.println("DogStatic is eating meat");
                break;
            default:
                System.out.println("DogStatic wasn't to eat this food");
                break;
        }
    }
}
