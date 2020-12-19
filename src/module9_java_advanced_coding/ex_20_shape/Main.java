package module9_java_advanced_coding.ex_20_shape;

class Main {

    public static void main(String[] args) {

        Shape triangle = new Triangle(3, 4, 5);
        Shape rectangle = new Rectangle(2, 4);
        Shape hexagon = new Hexagon(4);

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        System.out.println("Rectangle area: " + + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + + rectangle.calculatePerimeter());
        System.out.println("Hexagon area: " + + hexagon.calculateArea());
        System.out.println("Hexagon perimeter: " + + hexagon.calculatePerimeter());

        System.out.println();

        Shape3D cube = new Cube(6);
        Shape3D cone = new Cone(6, 3);

        System.out.println("Cube area: " + cube.calculateArea());
        System.out.println("Cube volume: " + cube.calculateVolume());
        System.out.println("Cone area: " + cone.calculateArea());
        System.out.println("Cone volume: " + cone.calculateVolume());
        System.out.println();

        double water = 216.00;

        cube.fill(water);
        cone.fill(water);

        cube.fill(10);
        cube.fill(4000);

    }
}
