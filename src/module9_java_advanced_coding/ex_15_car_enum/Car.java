package module9_java_advanced_coding.ex_15_car_enum;

enum Car {
    FERRARI(1000000, 390),
    PORSCHE(100000, 300),
    MERCEDES(50000, 320),
    BMW(75000, 330),
    OPEL(15000, 280),
    FIAT(12000, 250),
    TOYOTA(14000, 270);

    private final int price;
    private final Integer maxSpeed;

    Car(int price, Integer maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public boolean isPremium() {
        return this.price >= 50000;
    }

    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isFasterThan(Car car) {

        return this.maxSpeed.compareTo(car.maxSpeed) > 0;
    }
}
