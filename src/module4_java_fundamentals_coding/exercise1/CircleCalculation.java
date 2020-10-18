package module4_java_fundamentals_coding.exercise1;

class CircleCalculation {

    public static void main(String[] args) {
        float radius = 5.0F;
        System.out.println("Circle diameter = " + calculateCircleDiameter(radius));
        System.out.format("Circle perimeter = %.2f", calculateCirclePerimeter(radius));
        System.out.println();
    }

    private static float calculateCircleDiameter(float radius) {
        return 2 * radius;
    }

    private static double calculateCirclePerimeter(float radius) {
        return 2 * Math.PI * radius;
    }
}
