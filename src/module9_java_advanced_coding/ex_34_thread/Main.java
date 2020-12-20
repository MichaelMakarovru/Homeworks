package module9_java_advanced_coding.ex_34_thread;

class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.setName("My thread");

        Thread thread = new Thread(new MyRunnable());
        thread.setName("My runnable");

        myThread.start();
        thread.start();



    }
}
