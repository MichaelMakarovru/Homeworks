package module2_java_fundamentals.lesson1.operators;

public class OperatorsExamples {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        System.out.println("Operations with integers: ");
        System.out.println(a + b); //addition
        System.out.println(a - b); //subtraction
        System.out.println(a * b); //multiplication
        System.out.println(b / a); //division
        System.out.println(b % a); //modulus
        System.out.println(10 % 2); //result == 0
        System.out.println(11 % 2); //result == 1
        System.out.println();

        double d = 5.00;
        double f = 6.00;
        System.out.println("Integers vs. doubles example: ");
        //Result of operation with integers is integer
        System.out.println("6 / 5 = " + (b / a));
        //Result of operation with doubles is double
        System.out.println("6.00 / 5.00 = " + (f / d));

        System.out.println();
        System.out.println("Unary operators: ++ and --");
        int c = 6;
        System.out.println("c = " + c);
        System.out.println("Pre-increment increases c and then prints. ++с = " + ++c);
        System.out.println("Post-increment prints first and then increases c. ++с = " + c++);
        System.out.println("c = " + c);
        //The same with the pre-decrement and post-decrement
        System.out.println("--c = " + --c);
        System.out.println("c-- = " + c--);
        System.out.println("c = " + c);
        System.out.println();

        System.out.println("Assigment operators");
        int e = 5; //assigns 5 to the variable named e with a datatype of int
        e += 5; //equals to e = e + 5;
        System.out.println("e += 5: " + e);
        e -= 5; //equals to e = e - 5;
        System.out.println("e -= 5: " + e);
        e *= 5; //equals to e = e * 5;
        System.out.println("e *= 5: " + e);
        e /= 5; //equals to e = e / 5;
        System.out.println("e /= 5: " + e);
        e %= 5; //equals to e = e % 5;
        System.out.println("e %= 5: " + e);
        System.out.println();

        System.out.println("Comparison operators");
        int t = 5;
        int o = 6;
        boolean tEqualsO = t == o; //equals
        System.out.println("5 == 6 = " + tEqualsO);
        boolean tNotEqualsO = t != o; //not equals
        System.out.println("5 != 6 = " + tNotEqualsO);
        System.out.println("5 > 6 = " + (t > o)); //greater
        System.out.println("5 < 6 = " + (t < o)); //less
        System.out.println("5 >= 6 = " + (t >= o)); //greater or equals
        System.out.println("5 <= 6 = " + (t <= o)); //less or equals
    }
}
