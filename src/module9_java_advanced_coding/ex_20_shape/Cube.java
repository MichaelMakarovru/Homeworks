package module9_java_advanced_coding.ex_20_shape;

class Cube extends Shape3D {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        throw new UnsupportedOperationException
                ("Cannot calculate perimeter of a 3D object");
    }

    @Override
    double calculateArea() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }
}
