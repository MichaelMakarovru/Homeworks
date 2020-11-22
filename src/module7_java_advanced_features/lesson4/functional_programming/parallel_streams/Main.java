package module7_java_advanced_features.lesson4.functional_programming.parallel_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {

        //Creation
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Stream<Integer> stream = integerList.parallelStream();

        Stream<Integer> stream1 = Stream.of(1, 2, 3).parallel();

        Stream<Integer> example
                = Stream.iterate(1, i -> i + 1).limit(4000);

        long start = System.currentTimeMillis();

            long counter = example.map(i -> {
                try {
                    return process(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return i;
            }).count();


        long end = System.currentTimeMillis();
        long result = (end - start) / 1000;
        System.out.println("Non parallel counter: " + counter);
        System.out.println("Non parallel time: " + result);


        example = Stream.iterate(1, i -> i + 1).limit(4000);

        start = System.currentTimeMillis();

        counter = example.parallel().map(i -> {
            try {
                return process(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return i;
        }).count();

        end = System.currentTimeMillis();
        result = (end - start) / 1000;
        System.out.println("Parallel counter: " + counter);
        System.out.println("Parallel time: " + result);

    }

    public static int process(int i) throws InterruptedException {
        Thread.sleep(10);
        return i + 1;
    }
}
