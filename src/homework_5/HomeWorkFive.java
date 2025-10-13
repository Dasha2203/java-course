package homework_5;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {
        System.out.println("Введите количество строк (m): ");
        int m = inputIntPositiveNumber(true);

        System.out.println("Введите количество столбцов (n): ");
        int n = inputIntPositiveNumber(true);

        System.out.println("Введите минимальное значение (min): ");
        int min = inputIntPositiveNumber(true);

        System.out.println("Введите максимальное значение (max): ");
        int max = inputIntPositiveNumber(true);

        int[][] arr = generateMultiDimensionalArray(m, n, min, max);

        System.out.println("Исходный массив:");
        printMultiArr(arr);

        System.out.println("Введите число, которое нужно добавить к каждому элементу массива: ");
        int incrementNumber = inputIntPositiveNumber(true);


        int[][] incrementedArr = addNumberToEachElementMultiArray(arr, incrementNumber);
        System.out.println("Массив после добавления числа:");
        printMultiArr(incrementedArr);


    }

    public static int[][] generateMultiDimensionalArray(int m, int n, int min, int max) {
        int[][] arr = new int[m][n];
        Random rnd = new Random();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rnd.nextInt(max) + 1;
            }
        }

        return arr;
    }

    public static int[][] addNumberToEachElementMultiArray(int[][] initialArr, int number) {
        int[][] currentArr = copyMultiArr(initialArr);
        int countRows = currentArr.length;
        int countCols = currentArr[0].length;

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {
                currentArr[i][j] += number;
            }
        }

        return currentArr;
    }

    public static int inputIntPositiveNumber(boolean isCanBeZero) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        boolean isValidNumber = false;
        int number = 0;

        while (!isValidNumber) {
            if (!input.hasNextInt()) {
                System.out.println("Введеннное значение должно быть целым числом");
                input.next();
                continue;
            }

            number = input.nextInt();

            if ((number > 0 && !isCanBeZero) || (isCanBeZero && number >= 0)) {
                isValidNumber = true;
            } else  {
                System.out.println("Число должно быть положительным");
            }
        }

        return number;
    }

    public static int[][] copyMultiArr(int[][] arr) {
        int countRows = arr.length;
        int countCols = arr[0].length;
        int[][] localArr = new int[arr.length][arr[0].length];

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {
                localArr[i][j] = arr[i][j];
            }

        }

        return localArr;
    }

    public static void printMultiArr(int[][] arr) {
        int countRows = arr.length;
        int countCols = arr[0].length;

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {
                int value = arr[i][j];
                System.out.print(" " + value);
                if (j == countCols - 1) System.out.println();
            }
        }
    }

}
