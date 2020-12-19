package module9_java_advanced_coding.ex_15_car_enum;

class Main {

    public static void main(String[] args) {
        System.out.println("Ferrari is premium: " + Car.FERRARI.isPremium());
        System.out.println("Ferrari is regular: " + Car.FERRARI.isRegular());
        System.out.println("Mercedes is premium: " + Car.MERCEDES.isPremium());
        System.out.println("Mercedes is regular: " + Car.MERCEDES.isRegular());
        System.out.println("Opel is premium: " + Car.OPEL.isPremium());
        System.out.println("Opel is regular: " + Car.OPEL.isRegular());
        System.out.println();

        System.out.println("Ferrari is faster than Toyota: " + Car.FERRARI.isFasterThan(Car.TOYOTA));
        System.out.println("Toyota is faster than BMW: " + Car.TOYOTA.isFasterThan(Car.BMW));
        System.out.println("Toyota is faster than Toyota: " + Car.TOYOTA.isFasterThan(Car.TOYOTA));

    }
}
