package homework_1;

public class HomeWorkOne {
    public static void main(String[] args) {
        System.out.println("========= TASK 1 ===========");

        double resTask1 = taskOne(5, 6);

        System.out.printf("Result task of 1: %f\n", resTask1);



        System.out.println("\n========= TASK 2 ===========");

        int resTask2 = taskTwo(26);

        System.out.printf("Result task of 2: %d\n", resTask2);



        System.out.println("\n========= TASK 3 ===========");

        int resTask3 = taskThree(262);

        System.out.printf("Result task of 3: %d\n", resTask3);



        System.out.println("\n========= TASK 4 ===========");

        int resTask4 = taskFour(5.55);

        System.out.printf("Result task of 4: %d\n", resTask4);



        System.out.println("\n========= TASK 5 ===========");
        taskFive(21, 8);



        System.out.println("\n========= TASK * ===========");
        taskWithStar(1, 2);

    }

    //    Написать приложение, которое будет вычислять и выводить значение по формуле:
    //    a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    public static double taskOne(int b, int c) {
        return (double) (4 * (b + c - 1)) / 3;
    }

    //    В переменной n хранится двузначное число. Создайте программу, вычисляющую и
    //    выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8
    //            (2+6)
    public static int taskTwo(int n) {
        int digit1 = (n / 10) % 100;
        int digit2 = n % 10;

        return digit1 + digit2;
    }


    //    В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
    //    выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
    //    9 (1+2+6).
    public static int taskThree(int n) {
        int digit1 = n / 100;
        int digit2 = (n / 10) % 10;
        int digit3 = n % 10;

        return digit1 + digit2 + digit3;
    }

    //    В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    //    программу, округляющую число n до ближайшего целого и выводящую результат на
    //    экран.
    public static int taskFour(double doubleNumber) {
        int integerPart = (int) doubleNumber;

        double doublePart = doubleNumber - integerPart;

        return (int) (integerPart + doublePart + 0.5);
    }

    //    В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
    //    на экран результат деления q на w с остатком. Пример вывода программы (для случая,
    //    когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
    public static void taskFive(int q, int w) {
        System.out.printf("First number: %d\n", q / w);
        System.out.printf("First number: %d\n", q % w);
    }


    //    Написать программу которая будет менять местами значение целочисленных
    //    переменных. Пример:
    //    int a = 1; int b = 2;
    //    //код (ваше решение)
    //    sout(a); //выведет 2
    //    sout(b); //выведет 1
    //    Усовершенствовать программу, использовать только 2 входные переменные (a,b);
    public static void taskWithStar(int number1, int number2) {
        int a = number1;
        int b = number2;

        System.out.printf("initial a = %d\n", a);
        System.out.printf("initial b = %d\n", b);

        a = a + b;

        b = a - b;
        a = a - b;

        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);
    }
}
