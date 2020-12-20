package module9_java_advanced_coding.ex_38_coffee_making_machine;

class CoffeeMaker implements Runnable {

    private CoffeeMachine coffeeMachine;

    public CoffeeMaker(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        for (int i = 0; i < 55; i++) {
            try {
                coffeeMachine.makeCoffee();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
