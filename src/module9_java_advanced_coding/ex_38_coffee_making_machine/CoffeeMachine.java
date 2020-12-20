package module9_java_advanced_coding.ex_38_coffee_making_machine;

import java.math.BigDecimal;

class CoffeeMachine {

    private BigDecimal waterLiters;
    private static long coffeeCount = 0;

    public CoffeeMachine() {
        waterLiters = new BigDecimal("5");
    }

    public BigDecimal getWaterLiters() {
        return waterLiters;
    }

    public void fillWater() {
        waterLiters = waterLiters.add(new BigDecimal("5"));
        System.out.println("Water is filled!");
    }

    public synchronized void makeCoffee() throws InterruptedException {

        if (waterLiters.compareTo(BigDecimal.ZERO) == 0) {
            fillWater();
        }

        waterLiters = waterLiters.subtract(new BigDecimal("0.1"));
        coffeeCount++;
        System.out.println("Coffee served! Water remaining: " + waterLiters);
        System.out.println("Total cups served: " + coffeeCount);
    }
}
