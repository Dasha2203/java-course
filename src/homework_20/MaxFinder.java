package homework_20;

public class MaxFinder extends Thread {
    private int[] arr;
    private int max;

    public MaxFinder(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
    }

    public int getMax() {
        return max;
    }
}