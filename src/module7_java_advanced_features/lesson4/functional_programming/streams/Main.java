package module7_java_advanced_features.lesson4.functional_programming.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {

    public static void main(String[] args) {

        //Print two first names with length of 4 in alphabetical order from
        //array list of strings.
        List<String> listOfNames = Arrays.asList
                ("Ann", "John", "Mike", "Michael", "Kathie", "Margaret", "Peter",
                        "Robert", "Kate");

        printOldApproach(listOfNames);
        System.out.println();
        printStreamApproach(listOfNames);
    }

    public static void printOldApproach(List<String> list) {

        List<String> listOfNamesWithLengthFour = new ArrayList<>();

        for (String name : list) {
            if (name.length() == 4) {
                listOfNamesWithLengthFour.add(name);
            }
        }

        Collections.sort(listOfNamesWithLengthFour);

        int endOfIteration
                = Math.min(listOfNamesWithLengthFour.size(), 2);

        for (int i = 0; i < endOfIteration; i++) {
            System.out.println(listOfNamesWithLengthFour.get(i));
        }
    }

    public static void printStreamApproach(List<String> list) {

        list.stream()
                .filter(s -> s.length() == 4)
                .sorted()
                .limit(2)
                .forEach(s -> System.out.println(s));
    }
}
