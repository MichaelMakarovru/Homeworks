package module9_java_advanced_coding.ex_09_geometry;

class Point2D implements Movable {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x = this.x + moveDirection.getX();
        this.y = this.y + moveDirection.getY();
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
