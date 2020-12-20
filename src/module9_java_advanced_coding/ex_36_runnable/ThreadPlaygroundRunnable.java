package module9_java_advanced_coding.ex_36_runnable;

class ThreadPlaygroundRunnable implements Runnable {

    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Step: " + i + "; Thread: " + Thread.currentThread().getName());
            System.out.println("Runnable name: " + this.name);
        }
    }
}
