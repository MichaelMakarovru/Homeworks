package module7_java_advanced_features.lesson3.concurrency.synchronization;

class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread thread1 = new Thread(new MyRunnableCounter(counter));
        Thread thread2 = new Thread(new MyRunnableCounter(counter));

        thread1.start();
        thread2.start();

        Thread thread3 = new Thread(new MyRunnableAtomic(counter));
        Thread thread4 = new Thread(new MyRunnableAtomic(counter));

        thread3.start();
        thread4.start();

        Thread thread5 = new Thread(new MyRunnableSynchronizedObject(counter));
        Thread thread6 = new Thread(new MyRunnableSynchronizedObject(counter));

        thread5.start();
        thread6.start();

        Thread thread7 = new Thread(new MyRunnableSyncMethod(counter));
        Thread thread8 = new Thread(new MyRunnableSyncMethod(counter));

        thread7.start();
        thread8.start();

        Thread.sleep(5000);
        System.out.println("Regular long = " + counter.getLongCounter());
        System.out.println("Atomic long = " + counter.getAtomicLong());
        System.out.println("Synchronized block = " + counter.getLongCounter2());
        System.out.println("Synchronized method = " + counter.getLongCounter3());
        System.out.println();

        Thread thread9 = new Thread(new MyRunnableVolatileUpdater(counter));
        Thread thread10 = new Thread(new MyRunnableVolatileReader(counter));
        Thread thread11 = new Thread(new MyRunnableVolatileReader(counter));

        thread9.start();
        thread10.start();
        thread11.start();

        Thread.sleep(10000);

        System.out.println("Volatile long = " + counter.getVolatileLong());
    }
}
