package module9_java_advanced_coding.ex_17_conversion;

class Main {

    public static void main(String[] args) {

        MeasurementConverter measurementConverter = new MeasurementConverter();

        double value = 3.5;
        System.out.println("3.5 meters = " +
                measurementConverter.convert(value, ConversionType.METERS_TO_YARDS) +
                " yards");

        System.out.println("3.5 yards = " +
                measurementConverter.convert(value, ConversionType.YARDS_TO_METERS) +
                " meters");
    }
}
