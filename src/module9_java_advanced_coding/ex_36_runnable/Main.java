package module9_java_advanced_coding.ex_36_runnable;

class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadPlaygroundRunnable("Runnable 1"));
        thread1.setName("Thread 1");

        Thread thread2 = new Thread(new ThreadPlaygroundRunnable("Runnable 2"));
        thread2.setName("Thread 2");

        thread1.start();
        thread2.start();
    }
}
