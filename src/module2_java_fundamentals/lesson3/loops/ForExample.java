package module2_java_fundamentals.lesson3.loops;

public class ForExample {

    public static void main(String[] args) {

        int x = 5;
        System.out.println("x = " + x);
        for (int i = 0; i < 10; i++) { //i++ i = i + 1
            x = x + 5;
        }
        System.out.println("x = " + x);

        for (int i = 10; i > 0; i--) { //i-- i = i - 1
            x = x - 5;
        }
        System.out.println("x = " + x);

        //Do not do that
        int i = 0;
        for (;;) {
            x = x + 5;
            i++;
            if (i >= 10) {
                break;
            }
        }
        System.out.println("x = " + x);
    }
}
