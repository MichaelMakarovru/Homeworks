package module2_java_fundamentals.lesson1.primitives;

public class PrimitiveDataTypesExample {
    public static void main(String[] args) {
        byte x = 127;
        System.out.println(x);

        double y = 1.00;
        System.out.println(y);

        char b = 'a';
        System.out.println(b);
        //Java knows about cyrillic
        char z = 'я';
        System.out.println(z);

        //You can use underscore for large numbers
        //This will make them easier to read
        int p = 1_000_000_000;
        System.out.println(p);
    }
}
