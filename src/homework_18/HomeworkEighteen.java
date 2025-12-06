package homework_18;

import java.util.*;
import java.util.stream.Collectors;

public class HomeworkEighteen {
    public static void main(String[] args) {
    //    Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
    //    Stream'ов:
    //            - Удалить дубликаты
    //            - Оставить только четные элементы
    //            - Вывести сумму оставшихся элементов в стриме
        System.out.println();

        int[] numbers = new int[]{ 1, 2, 2, 3, 3, 4, 5 };
        Arrays.stream(numbers)
                .distinct()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);


    //    Задача *:
    //    Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
    //    этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
    //    Среди отобранных значений отобрать только те, которые имеют нечетное количество
    //    букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.

        HashMap<Integer, String> users = new HashMap<>();
        users.put(1, "Dasha");
        users.put(2, "Egor");
        users.put(3, "Zina");

        System.out.println(users);

        Set<Integer> targetIds = Set.of(1, 2, 5, 8, 9, 13);

        Map<Integer, String> filteredData = users.entrySet().stream()
                .filter(entry -> targetIds.contains(entry.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));
        filteredData.forEach((id, name) -> System.out.println(id + " - " + name));

        List<String> reversedNames = users.entrySet().stream()
                .filter(e -> targetIds.contains(e.getKey()))
                .map(Map.Entry::getValue)
                .filter(name -> name.length() % 2 != 0)
                .map(name -> new StringBuilder(name).reverse().toString())
                .toList();

        System.out.println("Результат: " + reversedNames);
    }
}
