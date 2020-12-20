package module9_java_advanced_coding.ex_38_coffee_making_machine;

class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Thread thread1 = new Thread(new CoffeeMaker(coffeeMachine));
        Thread thread2 = new Thread(new CoffeeMaker(coffeeMachine));

        thread1.start();
        thread2.start();
    }
}
