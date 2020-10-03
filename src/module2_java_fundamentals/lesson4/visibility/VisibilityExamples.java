package module2_java_fundamentals.lesson4.visibility;

public class VisibilityExamples {

    //we see this variable anywhere inside the class
    private static final int Y = 2;

    public static void main(String[] args) {

        //we can see x anywhere inside main method
        int x = 5;
        System.out.println(Y);

        //we can see sum anywhere inside main method
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
            } //after this bracket } w does not exist anymore
            //System.out.println(w);
        }//after this bracket } z does not exist anymore
        //System.out.println(z);
        System.out.println(sum);
    }
}
