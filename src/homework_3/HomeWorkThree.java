package homework_3;

import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        System.out.println("TASK 1 ==========================");
        taskOne();
        System.out.println("TASK 2 ==========================");
        taskTwo();
        System.out.println("TASK 3 ==========================");
        taskThree();
        System.out.println("TASK 4 ==========================");
        taskFour();
        System.out.println("TASK * ==========================");
        taskWithStar();

        System.out.println("PRACTICE 1 ==========================");
        practiceOne();
        System.out.println("PRACTICE 2 ==========================");
        practiceTwo();
        System.out.println("PRACTICE 3 ==========================");
        practiceThree();
    }

    //    Напишите программу, которая будет принимать на вход число из консоли и на выход
    //    будет выводить сообщение четное число или нет. Для определения четности числа
    //    используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    public static void taskOne() {
        int number = inputIntPositiveNumber();

        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }

    //    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //    Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
    public static void taskTwo() {
        System.out.print("Введите температуру: ");
        int temp = inputIntPositiveNumber();

        if (temp > -5) {
            System.out.println("Warm");
        } else if (temp > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }

    //    Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно
    public static void taskThree() {
        int i = 10;

        while (i <= 20) {
            System.out.printf("%d -> %d\n", i, i * i);
            i += 1;
        }
    }

    //    Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //    7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void taskFour() {
        int i = 7;

        while (i <= 98) {
            System.out.printf("%d\n", i);
            i += 7;
        }
    }

    //    Напишите программу, где пользователь вводит любое целое положительное число. А
    //    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //    ввести некорректные данные.
    public static void taskWithStar() {
        int number = inputIntPositiveNumber();

        int amount = 0;
        int i = 1;

        while (i <= number) {
            amount += i;
            i += 1;
        }

        System.out.printf("Сумма от %d до %d = %d\n", 1, number, amount);
    }

    //    Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в
    //    консоль соответствующую пору года по номеру месяца. При решении использовать
    //      switch
    public static void practiceOne() {
        System.out.println("Введите номер месяца: ");
        int numberMonth = inputIntPositiveNumber();

        switch (numberMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Не валидное число");
        }
    }

    // Используя while вывести все числа от 0 до 25 в одну строку через пробел.
    public static void practiceTwo() {
        int i = 0;

        while (i <= 25) {
            System.out.printf("%d ", i);
            i += 1;
        }
    }

    //    Используя for вывести каждое четное число от 2 до 20 включительно и больше 10.
    public static void practiceThree() {
        for (int i = 2; i <= 20; i++) {
            if (i <= 10) continue;

            if (i % 2 == 0) System.out.printf("%d ", i);
        }
    }

    public static int inputIntPositiveNumber() {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        boolean isValidNumber = false;
        int number = 0;

        while (!isValidNumber) {
            if (!input.hasNextInt()) {
                System.out.println("Введеннное значение должно быть целым");
                input.next();
                continue;
            }

            number = input.nextInt();

            if (number > 0) {
                isValidNumber = true;
            } else  {
                System.out.println("Число должно быть положительным");
            }
        }

        return number;
    }
}
