package homework_20;

class Store {
    private int items = 0;
    private final int MAX_ITEMS = 3;

    public synchronized void produce() throws InterruptedException {
        while (items == MAX_ITEMS) {
            System.out.println("The store is full");
            wait();
        }

        items++;
        System.out.println("The manufacturer has produced the product.\n In the store:" + items);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (items == 0) {
            System.out.println("The store is empty");
            wait();
        }

        items--;
        System.out.println("The buyer purchased the product.\n In the store: " + items);
        notifyAll();
    }
}
