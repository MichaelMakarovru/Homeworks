package module7_java_advanced_features.lesson3.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorServiceExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();

        service.execute(new MyRunnableTask());

        Future runnableFuture = service.submit(new MyRunnableTask());
        Future<String> callableFuture = service.submit(new MyCallableTask());
        System.out.println("Callable Future value: " + callableFuture.get());
        System.out.println("Runnable Future value: " + runnableFuture.get());
        System.out.println("Is done: " + callableFuture.isDone());
        System.out.println("Is cancelled: " + callableFuture.isCancelled());
        System.out.println();

        List<MyCallableTask> taskList = new ArrayList<>();
        taskList.add(new MyCallableTask());
        taskList.add(new MyCallableTask());
        taskList.add(new MyCallableTask());

        List<Future<String>> result = service.invokeAll(taskList);
        for (Future<String> stringFuture : result) {
            System.out.println(stringFuture.get());
        }
        System.out.println();

        String future = service.invokeAny(taskList);
        System.out.println(future);

        service.shutdown();
    }
}
