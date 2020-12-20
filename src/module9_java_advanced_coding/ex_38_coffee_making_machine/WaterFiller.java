package module9_java_advanced_coding.ex_38_coffee_making_machine;

class WaterFiller implements Runnable {

    private CoffeeMachine coffeeMachine;

    public WaterFiller(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        coffeeMachine.fillWater();
    }
}
