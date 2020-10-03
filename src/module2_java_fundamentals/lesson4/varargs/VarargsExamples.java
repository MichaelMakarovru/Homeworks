package module2_java_fundamentals.lesson4.varargs;

public class VarargsExamples {

    public static void main(String...args) {

        System.out.println(sumNumbers(5, 5, 5, 5, 46, 384, 1));
        System.out.println(concatString("Hello", " ", "World", "!"));
    }

    public static int sumNumbers(int x, int...numbers) {

        int sum = x;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static String concatString(String...strings) {

        String s = "";
        for (int i = 0; i < strings.length; i++) {
            s += strings[i];
        }
        return s;
    }
}
