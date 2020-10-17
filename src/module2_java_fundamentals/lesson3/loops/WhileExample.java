package module2_java_fundamentals.lesson3.loops;

public class WhileExample {

    public static void main(String[] args) {

        int x = 5;
        System.out.println("x = " + x);
        int i = 0;
        while (i < 10) {
            i++;
            x = x + 5;
        }
        System.out.println("x = " + x);

        while (i > 0) {
            i--;
            x = x - 5;
        }
        System.out.println("x = " + x);
    }
}
