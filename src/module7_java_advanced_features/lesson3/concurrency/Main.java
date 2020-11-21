package module7_java_advanced_features.lesson3.concurrency;

class Main {

    public static void main(String[] args) {

        System.out.println("Main Start");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Parallel Hello.");
            }
        });

        Thread thread2 = new Thread(new MyRunnableTask());

        thread.start();
        thread2.start();

        System.out.println("Main End");
    }
}
