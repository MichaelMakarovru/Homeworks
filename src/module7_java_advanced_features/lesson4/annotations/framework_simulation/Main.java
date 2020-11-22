package module7_java_advanced_features.lesson4.annotations.framework_simulation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Test test = new Test();

        Class<Test> testClass = Test.class;
        //Call all methods with @TestAnnotation
        for (Method method : testClass.getMethods()) {
            if (null != method.getAnnotation(TestAnnotation.class)) {
                method.invoke(test);
            }
        }
    }
}
