package module9_java_advanced_coding.ex_17_conversion;

class MetersToYardsConverter implements Converter {

    @Override
    public double convert(double value) {
        return value * 1.094;
    }
}
