package module4_java_fundamentals_coding.exercise3;

class QuadraticEquation {

    public static void main(String[] args) {

        int a = 3;
        int b = 14;
        int c = 5;

        int delta = calculateDelta(a, b, c);

        if (delta < 0) {
            System.out.println("Delta is negative.");
        } else {
            System.out.println("x1 = " + calculateX1(a, b, delta));
            System.out.println("x2 = " + calculateX2(a, b, delta));
        }
    }

    private static int calculateDelta(int a, int b, int c) {
        return (int) Math.pow(b, 2) - 4 * a * c;
    }

    private static double calculateX1(int a, int b, int delta) {
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    private static double calculateX2(int a, int b, int delta) {
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
}
