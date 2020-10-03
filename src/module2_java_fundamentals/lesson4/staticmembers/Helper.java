package module2_java_fundamentals.lesson4.staticmembers;

class Helper {

    public static final int YEAR_JAVA_CREATED = 1996;

    private Helper(){}

    public static String removeSpaces(String carNumber) {
        return carNumber.replaceAll(" ", "");
    }
}
