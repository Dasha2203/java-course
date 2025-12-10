package homework_20;

public class MinFinder extends Thread {
    private int[] arr;
    private int min;

    public MinFinder(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
    }

    public int getMin() {
        return min;
    }
}