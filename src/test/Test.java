package test;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5};

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fdf");
        }

    }
}
