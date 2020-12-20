package module9_java_advanced_coding.ex_29_partof;

import java.util.List;
import java.util.function.Predicate;

class Checker<T> {

    public double partOF(List<T> list, Predicate<T> predicate) {

        int counter = 0;

        for (T t : list) {
            if (predicate.test(t)) {
                counter++;
            }
        }

        return counter * 100 / list.size();
    }
}
