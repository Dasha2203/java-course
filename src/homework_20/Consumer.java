package homework_20;

class Consumer implements Runnable {
    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(800);  // имитация покупки
                store.consume();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}