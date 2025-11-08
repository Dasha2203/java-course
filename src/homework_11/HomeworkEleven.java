package homework_11;

import java.util.Scanner;

public class HomeworkEleven {
    public static void main(String[] args) {
        String[] arr = new String[3];
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        while (i < arr.length) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            arr[i] = scanner.nextLine();
            i++;
        }

        String minString = arr[0];
        String maxString = arr[0];

        for (String str: arr) {
            printString(str);
        }

        for (String str: arr) {
            if (str.length() < minString.length()) minString = str;
            if (str.length() > maxString.length()) maxString = str;
        }

        System.out.println("Минимальная строка: " + minString + "\nДлина: " + minString.length());
        System.out.println("Максимальная строка: " + maxString + "\nДлина: " + maxString.length());


        System.out.println("==".repeat(15) + " Sorting");
        String[] sortedStrings = sortArrString(arr);

        for (String str: sortedStrings) {
            printString(str);
        }

        System.out.println("==".repeat(15) + " AVG");
        double avg = getAvgLength(arr);
        System.out.println("AVG: " + avg);

        for (String str: sortedStrings) {
            if (str.length() < avg) {
                printString(str);
            }
        }

        System.out.println("==".repeat(15) + " Unique symbols word");
        for (String str: sortedStrings) {
            if (isUniqueSymbolWord(str)) {
                printString(str);
                break;
            }
        }

        System.out.println("==".repeat(15) + " Duplicate first string\n");
        String duplicatedFirstStr =  duplicateChars(arr[0]);
        printString(duplicatedFirstStr);

        System.out.println("==".repeat(15) + " TASK *\n");
        System.out.println("Введите строку:");
        String sentense = scanner.nextLine();
        System.out.println("Введите позицию слова:");
        int index = scanner.nextInt();
        String wordString = sentense.split(" ")[index];
        StringBuilder word = new StringBuilder(wordString);

        if (wordString.contentEquals(word.reverse())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

        scanner.close();
    }

    public static void printString(String str) {
        System.out.println("Строка: " + str + "\nДлина: " + str.length());
    }

    public static String[] sortArrString(String[] arr) {
        String[] newArr = copyStringArr(arr);
        boolean isChanged = false;

        for(int i = 0; i < newArr.length; i++) {
            if (i == (newArr.length - 1)) break;

            if(newArr[i].length() > newArr[i + 1].length()) {
                isChanged = true;
                String buffer = newArr[i + 1];
                newArr[i+1] = newArr[i];
                newArr[i] = buffer;
            }
        }

        return isChanged ? sortArrString(newArr) : newArr;
    }

    public static String[] copyStringArr(String[] arr) {
        String[] newArr = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }

    public static double getAvgLength (String[] arr) {
        int amount = 0;

        for (String str: arr) {
            amount += str.length();
        }

        return (double) amount / arr.length;
    }

    public static boolean isUniqueSymbolWord(String string) {
        char[] charArr = string.toCharArray();
        StringBuilder buffer = new StringBuilder();

        for (char c : charArr) {
            int index = buffer.toString().indexOf(c);

            if (index > -1) return false;

            buffer.append(c);
        }

        return true;
    }

    public static String duplicateChars(String str) {
        char[] charArr = str.toCharArray();

        String newStr = "";

        for (char c : charArr) {
            newStr += "" + c + c;
        }

        return newStr;
    }
}
