package module7_java_advanced_features.lesson2.enumeration.park;

class Main {

    public static void main(String[] args) {

        System.out.println(Season.WINTER + ": " + Season.WINTER.getExpectedVisitors());
        System.out.println(Season.SPRING + ": " + Season.SPRING.getExpectedVisitors());
        System.out.println(Season.FALL + ": " + Season.FALL.getExpectedVisitors());
        System.out.println(Season.SUMMER + ": " + Season.SUMMER.getExpectedVisitors());
    }
}
