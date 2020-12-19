package module9_java_advanced_coding.ex_20_shape;

class Hexagon extends Shape {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    double calculatePerimeter() {
        return 6 * a;
    }

    @Override
    double calculateArea() {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(a, 2);
    }
}
