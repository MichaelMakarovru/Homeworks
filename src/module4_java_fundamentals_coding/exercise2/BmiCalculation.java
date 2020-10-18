package module4_java_fundamentals_coding.exercise2;

class BmiCalculation {

    public static void main(String[] args) {

        double bmi = calculateBMI(82.0F, 182);
        System.out.println("BMI = " + bmi);
        System.out.println(bmiIsOptimal(bmi) ? "BMI optimal" : "BMI not optimal");
    }

    private static double calculateBMI(float weightInKg, int heightInCentimeters) {

        float heightInMeters = (float) heightInCentimeters / 100;
        return weightInKg / Math.pow(heightInMeters, 2);
    }

    private static boolean bmiIsOptimal(double bmi) {
        return bmi >= 18.5 && bmi <= 24.9;
    }
}
