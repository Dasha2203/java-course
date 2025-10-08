package homework_3;

import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskThree();
        practiceOne();
    }

    //    Напишите программу, которая будет принимать на вход число из консоли и на выход
    //    будет выводить сообщение четное число или нет. Для определения четности числа
    //    используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    public static void taskOne() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }

//    Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//    Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
    public static void taskTwo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temp = input.nextInt();

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

    //    Ввести с консоли любое число от 1 до 12. В зависимости от введённого числа вывести в
    //    консоль соответствующую пору года по номеру месяца. При решении использовать
    //      switch
    public static void practiceOne() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int numberMonth = input.nextInt();

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
}
