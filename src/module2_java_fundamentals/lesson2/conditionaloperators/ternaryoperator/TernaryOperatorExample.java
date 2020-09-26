package module2_java_fundamentals.lesson2.conditionaloperators.ternaryoperator;

public class TernaryOperatorExample {

    public static void main(String[] args) {

        int x = 6;

        String result1;
        if (x > 5) {
            result1 = "x > 5";
        } else {
            result1 = "x <= 5";
        }
        System.out.println(result1);

        System.out.println();

        String result = (x > 5) ? "x > 5" : "x <= 5";
        System.out.println(result);
    }
}
