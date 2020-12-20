package module9_java_advanced_coding.ex_28_nth_element;

import java.util.ArrayList;
import java.util.List;

class ElementFinder<T> {

    public List<T> find(List<T> list, int start, int step) {

        if (start < 0 || step < 0) {
            throw new IllegalArgumentException();
        }

        List<T> result = new ArrayList<>();

        for (int i = start; i < list.size(); i = i + step + 1) {

            result.add(list.get(i));
        }

        return result;
    }

//    public List<T> findUsingFunctionalProgramming(List<T> list, int start, int step) {
//
//        return list
//                .stream()
//                .skip(start)
//                .collect(Collectors.toList());
//    }
}
