package module2_java_fundamentals.lesson1;

public class OperationsExamples {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);
        System.out.println(b % a);
        System.out.println(10 % 2);
        System.out.println(11 % 2);
        System.out.println();

        double d = 5.00;
        double f = 6.00;
        System.out.println(f / 5);

        System.out.println();
        System.out.println("++--");
        int c = 6;
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        System.out.println(--c);
        System.out.println(c--);
        System.out.println(c);
        System.out.println();
        System.out.println();
        int e = 5;
        e += 5; //e = e + 5;
        e -= 5; //e = e - 5;
        e *= 5; //e = e * 5;
        e /= 5; //e = e / 5;
        e %= 5; //e = e % 5;

        int w = 5;
        System.out.println(w += 5);
        System.out.println(w -= 5);
        System.out.println(w *= 5);
        System.out.println(w /= 5);
        System.out.println(w %= 5);

        int t = 5;
        int o = 6;
        boolean tEqualsO = t == o;
        System.out.println(tEqualsO);
        boolean tNotEqualsO = t != o;
        System.out.println(tNotEqualsO);
        System.out.println(t > o);
        System.out.println(t < o);
        System.out.println(t >= o);
        System.out.println(t <= o);


    }
}
