package module9_java_advanced_coding.ex_20_shape;

class Cone extends Shape3D {

    private double side;
    private double radius;

    public Cone(double side, double radius) {
        this.side = side;
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * (getHeight() / 3);
    }

    @Override
    double calculatePerimeter() {
        throw new UnsupportedOperationException
                ("Cannot calculate perimeter of a 3D object");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * (radius +
                Math.sqrt(Math.pow(getHeight(), 2) + Math.pow(radius, 2)));
    }

    private double getHeight() {
        return Math.sqrt(Math.pow(side, 2) - Math.pow(radius, 2));
    }
}
