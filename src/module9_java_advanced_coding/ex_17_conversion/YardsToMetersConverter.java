package module9_java_advanced_coding.ex_17_conversion;

public class YardsToMetersConverter implements Converter {

    @Override
    public double convert(double value) {
        return value * 0.9144;
    }
}
