package module2_java_fundamentals.lesson2.conditionaloperators.ternaryoperator;

public class TernaryOperatorExample {

    public static void main(String[] args) {

        int x = 6;

        String result;
        if (x > 5) {
            result = "x > 5";
        } else {
            result = "x <= 5";
        }
        System.out.println(result);

        System.out.println();

        //we can replace the above code with ternary operator
        result = (x > 5) ? "x > 5" : "x <= 5";
        System.out.println(result);
    }
}
