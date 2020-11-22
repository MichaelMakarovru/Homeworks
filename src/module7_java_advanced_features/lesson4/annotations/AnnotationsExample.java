package module7_java_advanced_features.lesson4.annotations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class AnnotationsExample {

    //@Override
    //@Deprecated
    //@FunctionalInterface

    @SuppressWarnings({"unchecked", "deprecation"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("Hello");

        System.out.println(list.get(0));

        Date date = new Date(1, 2, 2020);
    }
}
