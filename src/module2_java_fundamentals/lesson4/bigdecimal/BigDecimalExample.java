package module2_java_fundamentals.lesson4.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalExample {

    public static void main(String[] args) {

        //Do not use double or float for currency
        double y = 2.0;
        for (int i = 0; i < 5; i++) {
            y += 0.01;
        }
        System.out.println(y);

        //Use BigDecimal for currency, it is precise
        BigDecimal bigDecimal = new BigDecimal("2.0");
        for (int i = 0; i < 5; i++) {
            bigDecimal = bigDecimal.add(new BigDecimal("0.01"));
        }
        System.out.println(bigDecimal);

        bigDecimal = bigDecimal.subtract(new BigDecimal("0.05"));
        System.out.println(bigDecimal);

        bigDecimal = bigDecimal.multiply(new BigDecimal("2"));
        System.out.println(bigDecimal);

        bigDecimal = bigDecimal.divide(new BigDecimal("2"));
        System.out.println(bigDecimal);

        y = bigDecimal.doubleValue();
        System.out.println("double = " + y);

        System.out.println(bigDecimal.negate());
        bigDecimal = new BigDecimal("2.07");
        bigDecimal = bigDecimal.setScale(1, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.pow(2));
    }
}
