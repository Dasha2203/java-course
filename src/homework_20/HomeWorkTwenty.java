package homework_20;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkTwenty {
    public static void main(String[] args) throws InterruptedException {
    //    Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
    //    потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
    //    вычислений возвращаются в метод main()
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count elements: ");

        int countNumbers = scanner.nextInt();
        int[] arr = new int[countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = scanner.nextInt();
        }

        MaxFinder maxThread = new MaxFinder(arr);
        MinFinder minThread = new MinFinder(arr);

        maxThread.start();
        minThread.start();

        maxThread.join();
        minThread.join();

        System.out.println("Max: " + maxThread.getMax());
        System.out.println("Min: " + minThread.getMin());

        //    Сортировка массива цифр в нескольких потоках различными алгоритмами:
        //     сортировка вставками;
        //     сортировка выбором;
        //     сортировка пузырьком.
        //    Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
        //    результат отсортированных массивов в консоль.

       Thread bubbleThread = new Thread(() -> {
            System.out.println("Bubble sort: " + Arrays.toString(SortArray.bubbleSort(arr)));
        });

        Thread selectionThread = new Thread(() -> {
            System.out.println("Selection sort: " + Arrays.toString(SortArray.selectionSort(arr)));
        });

        Thread insertThread = new Thread(() -> {
            System.out.println("Insert sort: " + Arrays.toString(SortArray.insertionSort(arr)));
        });

        bubbleThread.start();
        insertThread.start();
        selectionThread.start();

        bubbleThread.join();
        insertThread.join();
        selectionThread.join();



        //        Имеются сущности Магазин, Производитель, Покупатель. Цель задачи сделать так чтобы
        //        производитель произвел 5 единиц продукта, а покупатель их купил. Пока производитель
        //        не произвел продукт, покупатель не может его купить. При этом одновременно в магазине
        //        может находиться не более 3 товаров.
        Store store = new Store();

        Thread producer = new Thread(new Producer(store));
        Thread consumer = new Thread(new Consumer(store));

        producer.start();
        consumer.start();
    }
}
