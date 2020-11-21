package module7_java_advanced_features.lesson3.concurrency.synchronization;

class MyRunnableCounter implements Runnable {

    private Counter counter;

    public MyRunnableCounter(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            this.counter.increase();
        }
    }
}
