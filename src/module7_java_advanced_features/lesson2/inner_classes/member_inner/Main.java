package module7_java_advanced_features.lesson2.inner_classes.member_inner;

public class Main {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.callInner();

        //We can create static class instance using instance ot the Outer class
        Outer.Inner inner = outer.new Inner();
        inner.run();
    }
}
