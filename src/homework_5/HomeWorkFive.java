package homework_5;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {
        System.out.println("Введите количество строк (n):");
        int n = inputIntPositiveNumber(true);

        System.out.println("Введите количество столбцов (m):");
        int m = inputIntPositiveNumber(true);

        System.out.println("Введите минимальное значение (min):");
        int min = inputIntPositiveNumber(true);

        System.out.println("Введите максимальное значение (max):");
        int max = inputIntPositiveNumber(true);

        int[][] arr = generateMultiDimensionalArray(n, m, min, max);

        System.out.println("Исходный массив:");
        printIntMultiArr(arr);

        System.out.println("Введите число, которое нужно добавить к каждому элементу массива:");
        int incrementNumber = inputIntPositiveNumber(true);

        int[][] incrementedArr = addNumberToEachElementMultiArray(arr, incrementNumber);
        System.out.println("Массив после добавления числа:");
        printIntMultiArr(incrementedArr);

        // Task 2
        System.out.println("Шахмотная доска:");
        String[][] board = generateChessBoard();
        printStringMultiArr(board);

        // Task 3
        System.out.println("Массив - змейка:");
        int[][] snakeArr = generateSnakeArr(n, m);
        printIntMultiArr(snakeArr);
    }

    public static int[][] generateSnakeArr(int n, int m) {
        int[][] arr = new int[n][m];
        int counter = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 != 0 ){
                    arr[i][m - j - 1] = counter;
                } else {
                    arr[i][j] = counter;
                }
                counter++;
            }
        }

        return arr;
    }

    public static int[][] generateMultiDimensionalArray(int n, int m, int min, int max) {
        int[][] arr = new int[n][m];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = rnd.nextInt(max - min + 1) + min;
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

    public static void printIntMultiArr(int[][] arr) {
        int countRows = arr.length;
        int countCols = arr[0].length;

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {
                String formatted = String.format("%3d", arr[i][j]);
                System.out.print(formatted + " ");
//                if (value.length() == 1) {
//                    System.out.print(" " + "  " + value);
//                } else if (value.length() == 2) {
//                    System.out.print(" " + " " + value);
//                } else {
//                    System.out.print(" " + value);
//                }


                if (j == countCols - 1) System.out.println();
            }
        }
    }

    public static void printStringMultiArr(String[][] arr) {
        int countRows = arr.length;
        int countCols = arr[0].length;

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {
                String value = arr[i][j];
                System.out.print(" " + value);

                if (j == countCols - 1) System.out.println();
            }
        }
    }

    public static String[][] generateChessBoard() {
        int countRows = 8;
        int countCols = 8;
        String[][] board = new String[countRows][countCols];

        for (int i = 0; i < countRows; i++) {
            for (int j = 0; j < countCols; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }

        return board;
    }

}
