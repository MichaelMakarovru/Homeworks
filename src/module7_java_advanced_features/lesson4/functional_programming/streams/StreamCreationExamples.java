package module7_java_advanced_features.lesson4.functional_programming.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class StreamCreationExamples {

    public static void main(String[] args) {

        //Create Stream
        //1
        Stream<Integer> stream = Stream.of(1, 2, 3);

        //2
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Stream<Integer> stream1 = integerList.stream();

        //3 infinite stream
        Stream<Integer> stream2 = Stream.iterate(1, i -> i + 1);
    }
}
