package module2_java_fundamentals.lesson4.staticmembers;

class Helper {
    //static final variable
    public static final int YEAR_JAVA_CREATED = 1996;
    //private constructors are common for stateless classes
    private Helper(){}
    //static method
    public static String removeSpaces(String carNumber) {
        return carNumber.replaceAll(" ", "");
    }
}
