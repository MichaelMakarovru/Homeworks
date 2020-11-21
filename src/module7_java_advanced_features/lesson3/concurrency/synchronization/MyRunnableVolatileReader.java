package module7_java_advanced_features.lesson3.concurrency.synchronization;

public class MyRunnableVolatileReader implements Runnable {

    private Counter counter;

    public MyRunnableVolatileReader(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(counter.getVolatileLong());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
