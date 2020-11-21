package module7_java_advanced_features.lesson3.concurrency.synchronization;

public class MyRunnableSynchronizedObject implements Runnable {

    private Counter counter;

    public MyRunnableSynchronizedObject(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increase2();
        }
    }
}
