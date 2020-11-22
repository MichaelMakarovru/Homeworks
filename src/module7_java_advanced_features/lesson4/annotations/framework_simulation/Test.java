package module7_java_advanced_features.lesson4.annotations.framework_simulation;

class Test {

    @TestAnnotation
    public void test() {
        System.out.println("Test method runs");
    }

    @TestAnnotation
    public void test2() {
        System.out.println("Test 2 method");
    }

    public void notAnnotated() {
        System.out.println("Other method");
    }
}
