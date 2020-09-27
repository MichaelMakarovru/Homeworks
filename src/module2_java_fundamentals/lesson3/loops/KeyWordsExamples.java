package module2_java_fundamentals.lesson3.loops;

public class KeyWordsExamples {

    public static void main(String[] args) {

        int x = 5;
        System.out.println("x = " + x);
        for (int i = 0; i < 10; i++) {
            x = x + 5;
            System.out.println("i = " + i);
            if (x >= 25) {
                break;
            }
        }
        System.out.println("x = " + x);
        System.out.println();
        x = 0;
        for (int i = 0; i < 10; i++) {
            x = x + 1;
            if (x % 2 != 0) {
                continue;
            }
            System.out.println("x = " + x);
        }
        System.out.println();
        x = loop();
        System.out.println("x = " + x);

    }

    public static int loop() {
        int x = 5;
        System.out.println("x = " + x);
        for (int i = 0; i < 10; i++) {
            x = x + 1;
            System.out.println("i = " + i);
            if (x >= 25) {
                return x;
            }
        }
        return x;
    }
}
