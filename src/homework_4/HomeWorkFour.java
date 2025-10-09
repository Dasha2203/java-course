package homework_4;

import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");

        int arrLength = input.nextInt();

        int[] arr = generateArrItems(arrLength, 1, 100);

        // Task 1
        printArr(arr);

        // Task 2
        int[] maxMin = getMaxMinNumbers(arr);
        System.out.printf("Min -> %d\n", maxMin[0]);
        System.out.printf("Max -> %d\n", maxMin[1]);

        // Task 3
        int[] maxMinIdx = getMaxMinIdx(arr);
        System.out.printf("Min idx -> %d\n", maxMinIdx[0]);
        System.out.printf("Max idx -> %d\n", maxMinIdx[1]);
    }

    // Task 1
    // Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d-й элумент массива = %d\n", i, arr[i]);
        }
    }

    // Task 2
    // Найти минимальный-максимальный элементы и вывести в консоль
    public static int[] getMaxMinNumbers(int[] arr) {
        if (arr.length == 0) return new int[]{0, 0};
        if (arr.length == 1) return new int[]{arr[0], arr[0]};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return new int[]{min, max};
    }
    // Task 3
    // Найти индексы минимального и максимального элементов и вывести в консоль
    public static int[] getMaxMinIdx(int[] arr) {
        if (arr.length == 0) return new int[]{0, 0};
        if (arr.length == 1) return new int[]{arr[0], arr[0]};

        int minIdx = 0;
        int maxIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[minIdx]) minIdx = i;
            if (arr[i] > arr[maxIdx]) maxIdx = i;
        }

        return new int[]{minIdx, maxIdx};
    }

    public static int[] handleInputArrItems(int length) {
        if (length < 0) {
            System.out.println("Вы ввели неккоректное число");
            return new int[0];
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            Scanner inputItem = new Scanner(System.in);
            System.out.printf("Введите %d-й элемент массива: ", i + 1);
            arr[i] = inputItem.nextInt();
        }

        return arr;
    }

    public static int[] generateArrItems(int length, int min, int max) {
        if (length < 0) {
            System.out.println("Вы ввели неккоректное число");
            return new int[0];
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = getRandomNumber(min, max);
        }

        return arr;
    }

    public static int getRandomNumber(int min, int max) {
        int range = max - min;

        return (int) (Math.random() * (range + 1)) + min;
    }

}
