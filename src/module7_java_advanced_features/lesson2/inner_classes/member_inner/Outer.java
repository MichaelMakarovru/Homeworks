package module7_java_advanced_features.lesson2.inner_classes.member_inner;

class Outer {

    private String hi = "Hello!";
    private static String s = "d";

    //Inner Member class is declared on the class properties level
    protected class Inner {
        public int repeat = 3;

        public void run() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(hi);
                System.out.println(s);
            }
        }
    }


    public void callInner() {
        Inner inner = new Inner();
        inner.run();
    }
}
