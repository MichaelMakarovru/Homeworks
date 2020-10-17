package module2_java_fundamentals.lesson2.random;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt(6) + 1;
        int y = random.nextInt(6) + 1;
        int sum = x + y;
        System.out.println("First dice = " + x);
        System.out.println("Second dice = " + y);
        System.out.println("Sum = " + sum);
    }
}
