package homework_17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HomeworkSeventeen {


    public static void main(String[] args) {
        //    Задача 1:
        //    Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        //    когда пользователю исполнится 100 лет. Использовать Date/Time API
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате ДД.ММ.ГГГГ (например, 15.05.1990):");

        String input = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        LocalDate newBirthDate = birthDate.plusYears(100);

        System.out.println("100 лет будет в: " + newBirthDate);

        //        2. Используя Predicate среди массива чисел вывести только те, которые являются
        //        положительными.

        int[] arr = new int[]{1, 2, 3, -4, -3, -5, 4, 6};

        Predicate<Integer> isPositive = b -> b >= 0;

        for (int number : arr) {
            if (isPositive.test(number)) {
                System.out.println(number);
            }
        }

        //        Задача 3:
        //        Используя Function реализовать лямбду, которая будет принимать в себя строку в
        //        формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //        возвращать сумму, переведенную сразу в доллары.
        double rate = 3.0;

        Function<String, Double> bynToUsd = str -> {
            String amountStr = str.split(" ")[0];
            double byn = Double.parseDouble(amountStr);
            return byn / rate;
        };

        System.out.println(bynToUsd.apply("30 BYN"));

        //    Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
        //    формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
        //    выводить сумму, переведенную сразу в доллары

        Consumer<String> printUsd = str -> {
            String amountStr = str.split(" ")[0];
            double byn = Double.parseDouble(amountStr);
            double usd = byn / rate;
            System.out.println(usd + " USD");
        };

        printUsd.accept("30 BYN");


        //    Задача 5:
        //    Используя Supplier написать метод, который будет возвращать введенную с консоли
        //    строку задом наперед

        Supplier<String> reverseInput = () -> {
            Scanner s = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String i = s.nextLine();
            return new StringBuilder(i).reverse().toString();
        };

        System.out.println("Результат: " + reverseInput.get());

    }
}
