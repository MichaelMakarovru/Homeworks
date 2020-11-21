package module7_java_advanced_features.lesson3.concurrency;

import java.util.concurrent.Callable;

public class MyCallableTask implements Callable<String> {

    @Override
    public String call() {
        return "Callable Hello!";
    }
}
