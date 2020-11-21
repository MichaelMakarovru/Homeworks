package module7_java_advanced_features.lesson4.functional_programming.streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Stream;

class TerminalOperations {

    public static void main(String[] args) {

        //1 count
        Stream<Integer> integerStream = Stream.of(11, 12, 13);
        System.out.println(integerStream.count());

        //2 max
        integerStream = Stream.of(11, 12, 13);
        Optional<Integer> optional = integerStream.max(new IntegerComparator());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        //3 min
        integerStream = Stream.of(11, 12, 13);
        optional = integerStream.min(new IntegerComparator());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        //4 findAny
        integerStream = Stream.of(11, 12, 13);
        optional = integerStream.findAny();
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        //5 allMatch
        Stream<String> stringStream = Stream.of("Java", "Java", "Java");
        Predicate<String> predicate = s -> s.startsWith("Ja");
        boolean result = stringStream.allMatch(predicate);
        System.out.println(result);

//        integerStream = Stream.iterate(1, i -> i);
//        result = integerStream.allMatch(i -> i == 1);
//        System.out.println(result);

        //6 anyMatch
        stringStream = Stream.of("PHP", "Pearl", "Java");
        predicate = s -> s.startsWith("Ja");
        result = stringStream.anyMatch(predicate);
        System.out.println(result);

        //7 noneMatch
        stringStream = Stream.of("PHP", "Pearl", "C");
        predicate = s -> s.startsWith("Ja");
        result = stringStream.noneMatch(predicate);
        System.out.println(result);

        //8 forEach
        stringStream = Stream.of("PHP", "Pearl", "C", "Java");
        Consumer<String> consumer = s -> System.out.println(s);
        stringStream.forEach(consumer);

        //9 reduce
        integerStream = Stream.of(10, 20, 30);
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        Integer intResult = integerStream.reduce(0, binaryOperator);
        System.out.println(intResult);

        stringStream = Stream.of("C", "a", "t");
        BinaryOperator<String> stringBinaryOperator = (s, p) -> s.concat(p);
        String cat = stringStream.reduce("", stringBinaryOperator);
        System.out.println(cat);

        System.out.println("C" + "a" + "t");

        //10 collect
        stringStream = Stream.of("C", "a", "t");
        Supplier<StringBuilder> supplier = () -> new StringBuilder();
        BiConsumer<StringBuilder, String> consumer1 = (sb, s) -> sb.append(s);
        BiConsumer<StringBuilder, StringBuilder> consumer2 = (sb, sb2) -> sb.append(sb2);
        StringBuilder stringBuilder = stringStream
                .collect(supplier, consumer1, consumer2);
        System.out.println(stringBuilder.toString());
    }

    private static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }
}
