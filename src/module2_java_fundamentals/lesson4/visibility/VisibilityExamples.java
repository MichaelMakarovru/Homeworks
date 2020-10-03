package module2_java_fundamentals.lesson4.visibility;

public class VisibilityExamples {

    private static final int Y = 2;

    public static void main(String[] args) {

        int x = 5;
        System.out.println(Y);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        if (sum > 5) {
            int z = 0;
            sum += 1;
            if (z >= 0) {
                z += 1;
                int w = 0;
                sum += 1;
            }
            //System.out.println(w);
        }
        //System.out.println(z);
        System.out.println(sum);
    }
}
