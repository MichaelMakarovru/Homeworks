package module7_java_advanced_features.lesson3.concurrency.synchronization;

public class MyRunnableVolatileUpdater implements Runnable {

     private Counter counter;

    public MyRunnableVolatileUpdater(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increaseVolatile();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
