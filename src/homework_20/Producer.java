package homework_20;

class Producer implements Runnable {
    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(500);
                store.produce();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
