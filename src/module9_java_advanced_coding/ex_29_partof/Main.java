package module9_java_advanced_coding.ex_29_partof;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Main {

    public static void main(String[] args) {

        List<Integer> integerList = Stream
                .iterate(1, integer -> integer + 1)
                .limit(100)
                .collect(Collectors.toList());

        Checker<Integer> integerChecker = new Checker<>();
        System.out.print("Percentage of even elements: ");
        Predicate<Integer> predicate = integer -> integer % 2 == 0;
        System.out.println(integerChecker.partOF(integerList, predicate) + "%");

        System.out.print("Percentage of odd elements: ");
        System.out.println(integerChecker.partOF(integerList, integer -> integer % 2 != 0)+ "%");

        System.out.print("Percentage of elements > 33: ");
        System.out.println(integerChecker.partOF(integerList, integer -> integer > 33)+ "%");

        System.out.print("Percentage of elements < 33: ");
        System.out.println(integerChecker.partOF(integerList, integer -> integer < 33)+ "%");

        List<String> stringList = Arrays.asList("Cat", "Dog", "Duck", "Tiger", "Elephant", "Crocodile");
        Checker<String> stringChecker = new Checker<>();

        System.out.print("Percentage of strings with length > 4: ");
        System.out.println(stringChecker.partOF(stringList, s -> s.length() > 4) + "%");

        System.out.print("Percentage of strings starts with D: ");
        System.out.println(stringChecker.partOF(stringList, s -> s.startsWith("D")) + "%");
    }
}
