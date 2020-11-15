package module7_java_advanced_features.lesson2.inner_classes.local_inner;

class Outer {

    private int x = 5;

    public void calculate() {

        int y = 10;
        //Inner Local class is declared inside method
        class Inner {

            public void multiply() {
                System.out.println(x * y);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }
}
