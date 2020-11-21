package module7_java_advanced_features.lesson4.functional_programming.functional_interfaces;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class FunctionalInterfacesExamples {

    public static void main(String[] args) {

        //Supplier
        Supplier<LocalDate> supplier = () -> LocalDate.now();
        System.out.println(supplier.get());

        Supplier<StringBuilder> supplier1 = () -> new StringBuilder();
        StringBuilder sb = supplier1.get();
        sb.append("Hello");
        System.out.println(sb);

        //Consumer
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello!");


        //BiConsumer
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> biConsumer = (s, i) -> map.put(s, i);
        biConsumer.accept("Dog", 1);
        biConsumer.accept("Cat", 2);
        System.out.println(map);

        //Predicate
        Predicate<String> predicate = x -> x.isEmpty();
        System.out.println(predicate.test(""));
        System.out.println(predicate.test("Hello"));

        //BiPredicate
        BiPredicate<String, String> biPredicate = (s, p) -> s.startsWith(p);
        System.out.println(biPredicate.test("Java", "Ja"));

        //Function
        Function<String, Integer> function = s -> s.length();
        System.out.println(function.apply("Java"));

        //BiFunction
        BiFunction<String, String, String> biFunction = (s, p) -> s.concat(p);
        System.out.println(biFunction.apply("Hello ", "World."));


        //UnaryOperator
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply("Hello"));

        //BinaryOperator
        BinaryOperator<String> binaryOperator = (s, p) -> s.concat(p);
        System.out.println(binaryOperator.apply("Hello ", "World"));

        //Usage of custom Functional Interface
        TriFunction<String, String, String, String> triFunction =
                (s, p, k) -> s.concat(p).concat(k);
        System.out.println(triFunction.apply("Hello", " ", "World"));
    }
}
