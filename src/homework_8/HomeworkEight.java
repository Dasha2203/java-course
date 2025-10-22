package homework_8;

import homework_8.Animal.*;

public class HomeworkEight {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tiger name", 3);
        Rabbit rabbit = new Rabbit("Rabbit name", 5);
        Dog dog = new Dog("Dog name", 10);

        System.out.println(tiger);
        System.out.println(rabbit);
        System.out.println(dog);

        tiger.voice();
        rabbit.voice();
        dog.voice();

        tiger.eat("Live chicken");
        tiger.eat("grass");
        rabbit.eat("Live chicken");
        rabbit.eat("grass");
        dog.eat("meat");
    }
}
