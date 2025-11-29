package homework_15;

import java.util.ArrayList;
import java.util.List;

class AnimalCollection {
    private List<String> animals;

    public AnimalCollection() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println("Добавлено животное: " + animal);
    }

    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста, нечего удалять!");
            return null;
        }

        String removedAnimal = animals.remove(animals.size() - 1);
        System.out.println("Удалено животное: " + removedAnimal);
        return removedAnimal;
    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция животных пуста");
        } else {
            System.out.println("Текущая коллекция животных: " + animals);
        }
    }

    public int getSize() {
        return animals.size();
    }
}