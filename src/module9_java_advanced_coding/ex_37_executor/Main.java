package module9_java_advanced_coding.ex_37_executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<ThreadPlaygroundRunnable> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(new ThreadPlaygroundRunnable("Runnable - " + i));
        }

        for (ThreadPlaygroundRunnable threadPlaygroundRunnable : list) {
            executorService.submit(threadPlaygroundRunnable);
        }

        executorService.shutdown();
    }
}
