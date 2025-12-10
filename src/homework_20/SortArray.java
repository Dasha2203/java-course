package homework_20;

import java.util.Arrays;

public class SortArray {
    private int[] arr;

    public SortArray(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return this.arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < copyArr.length - 1; i++) {
                int leftElement = copyArr[i];
                int rightElement = copyArr[i + 1];

                if (rightElement < leftElement) {
                    int store = rightElement;

                    copyArr[i + 1] = leftElement;
                    copyArr[i] = store;
                    isSorted = false;
                }
            }
        }

        return  copyArr;
    }

    public static int[] insertionSort(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);

        for (int i = 1; i < copyArr.length; i++) {
            int key = copyArr[i];
            int j = i - 1;

            while (j >= 0 && copyArr[j] > key) {
                copyArr[j + 1] = copyArr[j];
                j--;
            }

            copyArr[j + 1] = key;
        }

        return copyArr;
    }

    public static int[] selectionSort(int[] arr) {
        int[] copyArr = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < copyArr.length - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < copyArr.length; j++) {
                if (copyArr[j] < copyArr[minIdx]) {
                    minIdx = j;
                }
            }

            int tmp = copyArr[minIdx];

            copyArr[minIdx] = copyArr[i];
            copyArr[i] = tmp;
        }

        return copyArr;
    }
}
