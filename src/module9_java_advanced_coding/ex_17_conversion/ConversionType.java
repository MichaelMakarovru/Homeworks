package module9_java_advanced_coding.ex_17_conversion;

public enum ConversionType {

    METERS_TO_YARDS(new MetersToYardsConverter()),
    YARDS_TO_METERS(new YardsToMetersConverter()),
    CENTIMETERS_TO_INCHES(new CentimetersToInches()),
    INCHES_TO_CENTIMETERS(new InchesToCentimetersConverter()),
    KILOMETERS_TO_MILES(new KilometersToMilesConverter()),
    MILES_TO_KILOMETERS(new MilesToKilometersConverter());

    Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }
}
