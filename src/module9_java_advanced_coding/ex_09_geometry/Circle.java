package module9_java_advanced_coding.ex_09_geometry;

class Circle implements Movable, Resizable {

    private final Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {

        double xMax = Math.abs(center.getX() - point.getX());
        double yMax = Math.abs(center.getY() - point.getY());
        return Math.max(xMax, yMax);
    }

    public Point2D getCenter() {
        return center;
    }

    public Point2D getPoint() {
        return point;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double factor) {

        if (factor == 0) return;

        if (factor > 0) {
            this.point = new Point2D
                    (this.point.getX() * factor,
                    this.point.getY() * factor);
        } else {
            this.point = new Point2D
                    (this.point.getX() / Math.abs(factor),
                            this.point.getY() / Math.abs(factor));
        }
    }
}
