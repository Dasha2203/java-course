package homework_4;

import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива: ");

        int arrLength = inputIntPositiveNumber(false, Integer.MAX_VALUE);

        int[] arr = generateArrItems(arrLength, 0, 9);
//        int[] arr = handleInputArrItems(arrLength);

        // Task 1
        System.out.println("\nTASK 1 ==========\n");
        printArr(arr);
        System.out.println("\nВ обратном порядке: \n");
        printReverseArr(arr);

        // Task 2
        System.out.println("\nTASK 2 ==========\n");
        int[] maxMin = getMaxMinNumbers(arr);
        System.out.printf("Min -> %d\n", maxMin[0]);
        System.out.printf("Max -> %d\n", maxMin[1]);

        // Task 3
        System.out.println("TASK 3 ==========");
        int[] maxMinIdx = getMaxMinIdx(arr);
        System.out.printf("Min idx -> %d\n", maxMinIdx[0]);
        System.out.printf("Max idx -> %d\n", maxMinIdx[1]);

        // Task 4
        System.out.println("\nTASK 4 ==========\n");
        int countZeroElements = getCountZeroElements(arr);
        System.out.printf("Количество 0-ых элементов в массиве -> %d\n", countZeroElements);

        if (countZeroElements == 0) {
            System.out.println("\nНулевых элементов в массиве нет\n");
        }

        // Task 5
        System.out.println("\nTASK 5 ==========\n");
        int[] swappedArr = swapElements(arr);
        System.out.println("\nИсходный массив:\n");
        printArr(arr);
        System.out.println("\nSwapped массив:\n");
        printArr(swappedArr);
        
        // Task 6
        System.out.println("\nTASK 6 ==========\n");
        boolean isIncreasing = isIncreasingArr(arr);
        
        if (isIncreasing) {
            System.out.println("Возрастающая последовательность");
        } else {
            System.out.println("Не возрастающая последовательность");
        }

        // Task *
        System.out.println("\nTASK * ==========\n");
        int[] increaseArr = taskWithStar();
        printArr(increaseArr);
    }

    // Task 1
    // Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d-й элимент массива = %d\n", i, arr[i]);
        }
    }

    public static void printReverseArr(int[] arr) {
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.printf("%d-й элимент массива = %d\n", i, arr[i]);
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

    // Task 4
    // Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    // сообщение, что их нет
    public static int getCountZeroElements(int[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) counter++;
        }

        return counter;
    }

    //    Пройти по массиву и поменять местами элементы первый и последний, второй и
    //    предпоследний и т.д.
    public static int[] swapElements(int[] arr) {
        int[] localArr = copyArr(arr);
        int variable;

        for (int i = 0; i < arr.length / 2; i++) {
            int endIndex = arr.length - 1 - i;
            variable = localArr[i];
            localArr[i] = localArr[endIndex];
            localArr[endIndex] = variable;
        }

        return localArr;
    }

    //    Проверить, является ли массив возрастающей последовательностью (каждое следующее
    //  число больше предыдущего).
    public static boolean isIncreasingArr(int[] arr) {
        boolean isIncrease = true;
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) continue;
            if (arr[i] < arr[i - 1]) {
                isIncrease = false;
                break;
            }
            
        }
        
        return isIncrease;
    }

    //    Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //    представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //    добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //    содержит нуля в начале, кроме самого числа 0.
    public static int[] taskWithStar() {
        System.out.print("Введите количество элементов массива: ");

        int arrLength = inputIntPositiveNumber(false, Integer.MAX_VALUE);
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Введите %d-й элемент массива: ", i + 1);
            arr[i] = inputIntPositiveNumber(arr.length == 1, 9);
        }

        boolean isCrowded = false;

        for (int i = arr.length - 1; i >= 0; i--) {
            int value = arr[i] + 1;

            if (value < 10) {
                arr[i] = value;
                break;
            }
            arr[i] = 0;

            if (i == 0) isCrowded = true;
        }

        if (!isCrowded) return arr;

        int[] result = new int[arr.length + 1];
        result[0] = 1;

        for (int i = 1; i < result.length; i++) {
            result[i] = arr[i - 1];
        }

        return  result;
    }

    public static int[] handleInputArrItems(int length) {
        if (length < 0) {
            System.out.println("Вы ввели неккоректное число");
            return new int[0];
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("Введите %d-й элемент массива: ", i + 1);
            arr[i] = inputIntPositiveNumber(true, 9);
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

    public static int inputIntPositiveNumber(boolean isCanBeZero, int limit) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int number = 0;

        while (true) {
            if (!input.hasNextInt()) {
                System.out.println("Введеннное значение должно быть целым числом");
                input.next();
                continue;
            }

            number = input.nextInt();

            if (number > limit) {
                System.out.printf("Число должно быть меньше, либо равно %d\n", limit);
                continue;
            }

            if ((number > 0 && !isCanBeZero) || (isCanBeZero && number >= 0)) {
                break;
            } else {
                System.out.println("Число должно быть положительным\n");
            }
        }

        return number;
    }

    public static int[] copyArr(int[] arr) {
        int[] localArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            localArr[i] = arr[i];
        }

        return localArr;
    }
}
