package module9_java_advanced_coding.ex_09_geometry;

class Main {

    public static void main(String[] args) {
        Point2D center = new Point2D(0, 0);
        Point2D point = new Point2D(3, 0);
        Circle circle = new Circle(center, point);
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Point: " + circle.getPoint());

        System.out.println(circle.getRadius());
        System.out.format("%.2f", circle.getPerimeter());
        System.out.println();
        System.out.format("%.2f", circle.getArea());

        System.out.println();

        circle.move(new MoveDirection(2, 1));
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Point: " + circle.getPoint());

        System.out.println(circle.getRadius());
        System.out.format("%.2f", circle.getPerimeter());
        System.out.println();
        System.out.format("%.2f", circle.getArea());

        System.out.println();

        circle.resize(1.5);
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Point: " + circle.getPoint());

        System.out.println(circle.getRadius());
        System.out.format("%.2f", circle.getPerimeter());
        System.out.println();
        System.out.format("%.2f", circle.getArea());

        System.out.println();

        circle.resize(-2);
        System.out.println("Center: " + circle.getCenter());
        System.out.println("Point: " + circle.getPoint());

        System.out.println(circle.getRadius());
        System.out.format("%.2f", circle.getPerimeter());
        System.out.println();
        System.out.format("%.2f", circle.getArea());
    }
}
