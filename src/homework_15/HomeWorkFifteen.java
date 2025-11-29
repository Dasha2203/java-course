package homework_15;

import java.util.*;

public class HomeWorkFifteen {
     public static void main(String[] args) {
        //         Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        //         4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        //         При решении использовать коллекции
         Scanner scanner = new Scanner(System.in);

         System.out.print("Введите набор чисел через запятую: ");
         String input = scanner.nextLine();

         String[] numbers = input.split(",\\s*");

         Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));
         String result = String.join(", ", uniqueNumbers);

         System.out.println("Результат: " + result);

         // Task 2
         AnimalCollection collection = new AnimalCollection();

         collection.addAnimal("Cat");
         collection.addAnimal("Dog");
         collection.addAnimal("Fox");

         collection.displayAnimals();

         collection.removeAnimal();

         collection.displayAnimals();

         System.out.println("Размер коллекции: " + collection.getSize());

         collection.removeAnimal();
         collection.removeAnimal();
         collection.removeAnimal();

         collection.displayAnimals();


         // TASK 3

         ArrayList<Student> students = new ArrayList<>();

         students.add(new Student("Dasha", "group1", 3, new SubjectMark(5, 5)));
         students.add(new Student("Egor", "group1", 3, new SubjectMark(4, 4)));
         students.add(new Student("Fedor", "group1", 3, new SubjectMark(2, 3)));

         Student.printStudents(students, 3);
         Student.removeStudentsWithLowMarks(students, 3);
         Student.printStudents(students, 3);

         // TASK *
         CustomArrayList<String> list = new CustomArrayList<>();

         list.add("Hello");
         list.add("World");
         list.add("Java");

         System.out.println(list.get(1));

         System.out.println(list.contains("Java"));

         list.remove(1);
         System.out.println(list.contains("World"));

         System.out.println(list.get(1));

         list.clear();
         System.out.println(list.size());


    }
}
