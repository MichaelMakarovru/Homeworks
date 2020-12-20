package module9_java_advanced_coding.ex_28_nth_element;

import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {

        List<Character> list = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g');

        ElementFinder<Character> elementFinder = new ElementFinder<>();

        List<Character> result = elementFinder.find(list, 2, 3);
        System.out.println(result);

//        result = elementFinder.findUsingFunctionalProgramming(list, 2, 3);
//        System.out.println(result);
    }
}
