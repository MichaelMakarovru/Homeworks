package module7_java_advanced_features.lesson2.enumeration.park;

enum Season {

    //Enums can have variables. Each enum constant must declare value.
    WINTER("Low number of visitors"),
    SPRING("Medium number of visitors"),
    SUMMER("High number of visitors"),
    FALL("Medium number of visitors");

    private String expectedVisitors;

    //Enums can have only private constructors.
    private Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public String getExpectedVisitors() {
        return expectedVisitors;
    }
}
