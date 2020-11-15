package module7_java_advanced_features.lesson2.inner_classes.statc_inner;

class Outer {

    public static int x = 5;

    //Static Inner class is declared on the class properties level
    static class Nested {
        private int price = 6;

        public void run() {
            System.out.println(price);
        }
    }
}
