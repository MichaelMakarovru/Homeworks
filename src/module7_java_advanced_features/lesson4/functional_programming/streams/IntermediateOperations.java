package module7_java_advanced_features.lesson4.functional_programming.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class IntermediateOperations {

    public static void main(String[] args) {

        Stream<Integer> integerStream;
        Stream<String> stringStream;

        //1 filter
        stringStream = Stream.of("Cat", "Dog", "Mouse", "Chicken");
        Predicate<String> predicate = s -> s.startsWith("C");
        stringStream.filter(predicate).forEach(s -> System.out.println(s));
        System.out.println();

        //2 distinct
        integerStream = Stream.of(1, 2, 3, 3, 2);
        integerStream.distinct().forEach(i -> System.out.println(i));
        System.out.println();

        //3 limit & skip
        integerStream = Stream.iterate(1, i -> i + 1);
        integerStream.skip(5).limit(2).forEach(i -> System.out.println(i));
        System.out.println();

        //4 map
        stringStream = Stream.of("Cat", "Dog", "Mouse", "Chicken");
        Function<String, Integer> function = s -> s.length();
        stringStream.map(function).forEach(i -> System.out.println(i));
        System.out.println();

        //5 flatMap
        List<Integer> list = Arrays.asList(1);
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        Stream<List<Integer>> listStream = Stream.of(list, list1, list2);
        Function<List<Integer>, Stream<Integer>> listIntegerFunction = l -> l.stream();
        listStream.flatMap(listIntegerFunction).forEach(i -> System.out.println(i));
        System.out.println();

        //6 sorted
        integerStream = Stream.of(4, 6, 2, 19, 34, 45, 99, 1, 3);
        integerStream.sorted().forEach(i -> System.out.println(i));
        System.out.println();

        //7 peek
        listStream = Stream.of(list, list1, list2);
        listStream.peek(l -> System.out.println(l))
                .flatMap(listIntegerFunction)
                .forEach(i -> System.out.println(i));
    }
}
