package module2_java_fundamentals.lesson1;
//Don't forget to import Random class
import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        //Create a Random instance
        Random random = new Random();
        //Generate int value. Generator will generate values starting
        // with 0 up to bound.
        //Bound is not included, that's why we are adding 1 to the result
        //to simulate a dice roll with a 1..6 dice.
        int x = random.nextInt(6) + 1;
        int y = random.nextInt(6) + 1;
        System.out.println(x);
        System.out.println(y);
    }
}
