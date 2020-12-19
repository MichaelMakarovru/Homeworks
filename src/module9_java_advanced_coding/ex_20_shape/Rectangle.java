package module9_java_advanced_coding.ex_20_shape;

class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculatePerimeter() {
        return  2 * (a + b);
    }

    @Override
    double calculateArea() {
        return a * b;
    }
}
