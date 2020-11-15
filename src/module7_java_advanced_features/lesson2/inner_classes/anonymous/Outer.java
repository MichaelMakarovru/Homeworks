package module7_java_advanced_features.lesson2.inner_classes.anonymous;

class Outer {

    public int calculate(int price) {

        //Anonymous class is declared inside method and implements interface or abstract class
        Sale sale = new Sale() {
            @Override
            int todaySale() {
                return 3;
            }
        };
        return price - sale.todaySale();
    }
}
