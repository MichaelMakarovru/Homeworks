package module7_java_advanced_features.lesson2.inner_classes.statc_inner;

class Main {

    public static void main(String[] args) {

        int y = Outer.x;
        //We can create static class instance without instance ot the Outer class
        Outer.Nested nested = new Outer.Nested();
        nested.run();
    }
}
