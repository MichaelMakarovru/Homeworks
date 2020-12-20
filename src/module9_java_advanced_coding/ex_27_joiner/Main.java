package module9_java_advanced_coding.ex_27_joiner;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {

        Joiner<Integer> joiner = new Joiner<>("-");
        String result = joiner.join(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(result);

        Joiner<String> joiner2 = new Joiner<>("! ");
        result = joiner2.join(Arrays.asList("Cat", "Dog", "Mouse", "Duck"));
        System.out.println(result);
    }
}
