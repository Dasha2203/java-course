package homework_20;

import java.util.Scanner;

class MyTask implements Runnable {

    public void run(){

        String name = Thread.currentThread().getName();  // получаем имя текущего потока

//        try{

            System.out.println(name + " started...");

            while(!Thread.currentThread().isInterrupted()){

                System.out.println(name + " works");

//                Thread.sleep(1000); // приостанавливаем поток на 1000 миллисекунд
            }
//        }
//        catch(InterruptedException ex){
//
//            System.out.println("gkgkgkkgk" + ex.getMessage());
//        }
        System.out.println(name + " finished...");
    }
}

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
    }
}
