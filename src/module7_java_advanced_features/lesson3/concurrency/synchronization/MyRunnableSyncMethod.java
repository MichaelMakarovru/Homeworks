package module7_java_advanced_features.lesson3.concurrency.synchronization;

public class MyRunnableSyncMethod implements Runnable {

    private Counter counter;

    public MyRunnableSyncMethod(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increase3();
        }
    }
}
