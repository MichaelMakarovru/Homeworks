package module9_java_advanced_coding.ex_17_conversion;

class MeasurementConverter {

    public double convert(double value, ConversionType type) {

        return type.converter.convert(value);
    }
}
