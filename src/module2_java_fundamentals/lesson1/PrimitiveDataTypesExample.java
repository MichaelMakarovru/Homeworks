package module2_java_fundamentals.lesson1;

public class PrimitiveDataTypesExample {
    public static void main(String[] args) {
        byte x = 127;
        x = (byte)(x + 1);
        System.out.println(x);

        double y = 1.00;
        System.out.println(y);

        char b = 'a';
        System.out.println(b);
        char z = 'я';
        System.out.println(z);

        int c = 5;
        int d = 6;

        System.out.println(c < d);

        int p = 1_000_000_000;
    }
}
