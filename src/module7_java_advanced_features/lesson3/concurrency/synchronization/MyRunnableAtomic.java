package module7_java_advanced_features.lesson3.concurrency.synchronization;

public class MyRunnableAtomic implements Runnable {

    private Counter counter;

    public MyRunnableAtomic(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            this.counter.atomicIncrease();
        }
    }
}
