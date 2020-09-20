package module2_java_fundamentals.lesson1;

public class OperationsWithVariousDataTypes {

    public static void main(String[] args) {

        //Overflowing example
        byte x = 110;
        System.out.println("x = " + x);
        x = (byte) (x + 100);
        System.out.println("x + 100 = " + x);
        System.out.println();

        //Type casting example
        short z = 3;
        System.out.println("z = " + z);
        //By default Java wants to store result of z * 100 operation
        //inside int variable. We must cast result to short
        //to be able to store it in short type variable
        z = (short) (z * 100);
        System.out.println("z * 100 = " + z);
        System.out.println();

        double y = 5.23;
        System.out.println("double y = " + y);
        //If we are casting double to int, we will loose the data
        //after the point
        int u = (int) y;
        System.out.println("y after casting to int = " + u);
        System.out.println();

        //If we are performing operations with double and int
        //result is casted to double by default
        double t = 5.34;
        int q = 5;
        System.out.println("int q / double t = " + (q / t));
        System.out.println("double t * int q = " + (t * q));
        //We can cast result to int manually
        System.out.println("double t * int q = (int) " +  (int)(t * q));
        System.out.println();

        //char
        char p = 'p';
        //we can cast char to int to obtain chars code in the UNICODE table
        int n = p;
        System.out.println("char p = " + p);
        System.out.println("char p UNICODE code = " + n);
        System.out.println();

        //we can increment char to obtain the next character
        char a = 'a';
        System.out.println("char = " + a);
        a += 1;
        System.out.println("char + 1 = " + a);
        System.out.println();

        //If we want to define long or float,
        //we have to use L or F postfix
        long i = 999999999999999L; //L after the number
        float f = 34.5F; //F after the number

        //We can assign values in different numerical systems
        //Binary. Use 0b prefix
        int m = 0b110; //1 * 4 + 1 * 2 + 0 * 1 = 6 in decimal
        System.out.println("110 in binary = " + m);
        //Octal. Use 0 prefix
        m = 015; // 1 * 8 + 5 * 1 = 13 in decimal
        System.out.println("15 in octal = " + m);
        //Hexadecimal. Use 0x prefix
        m = 0x2A; //2 * 16 + 10 * 1 = 42 in decimal
        System.out.println("2A in hexadecimal = " + m);
        System.out.println();

        //Do not store money values in double.
        //Double and float types are not precise.
        System.out.println("Doubles are not precise:");
        double money = 2.00;
        System.out.println("money = " + money);
        for (int j = 0; j < 3; j++) {
            money = money + 0.01;
        }
        System.out.println("2.00 + 0.01 + 0.01 + 0.01 = " + money);
    }
}
