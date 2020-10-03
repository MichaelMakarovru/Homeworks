package module2_java_fundamentals.lesson4.debugging;

public class DebuggingExample {

    public static void main(String[] args) {

        int result = 1;
        result *= 10;
        result *= 0;
        result *= 30;
        System.out.println(result);
    }
}
