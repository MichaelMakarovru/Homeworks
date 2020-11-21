package module7_java_advanced_features.lesson3.concurrency;

class MyRunnableTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Parallel Hello from separate class.");
    }
}
