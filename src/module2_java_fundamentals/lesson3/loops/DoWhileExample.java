package module2_java_fundamentals.lesson3.loops;

public class DoWhileExample {

    public static void main(String[] args) {

        int x = 5;
        int i = 0;
        System.out.println("x = " + x);
        do {
            x = x + 5;
            i++;
        } while (i < 10);
        System.out.println("x = " + x);
    }
}
