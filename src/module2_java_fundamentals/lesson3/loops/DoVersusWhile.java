package module2_java_fundamentals.lesson3.loops;

public class DoVersusWhile {

    public static void main(String[] args) {

        int x = 5;
        int i = 10;
        System.out.println("x = " + x);
        //do-while performs at least one step before checking the conditions
        do {
            x = x + 5;
            i++;
        } while (i < 10);
        System.out.println("x = " + x);

        x = 5;
        i = 10;
        System.out.println("x = " + x);
        //while checks the conditions and then decides if it's necessary to loop
        while (i < 10) {
            x = x + 5;
            i++;
        }
        System.out.println("x = " + x);
    }
}
