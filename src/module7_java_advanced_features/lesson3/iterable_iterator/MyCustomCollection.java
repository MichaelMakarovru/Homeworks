package module7_java_advanced_features.lesson3.iterable_iterator;

import java.util.Iterator;

//Custom collections must implement Iterable to be usable in foreach loop
class MyCustomCollection<T> implements Iterable<T> {

    Object[] array = new Object[5];
    int currentArrayIndex = 0;

    public void add(T t) {
        array[currentArrayIndex++] = t;
    }

    @Override
    public Iterator<T> iterator() {

        //Usage of custom iterator declared as anonymous class
        return new Iterator<T>() {

            int iteratorIndex = 0;

            @Override
            public boolean hasNext() {
                return array[iteratorIndex] != null;
            }

            @Override
            public T next() {
                return (T) array[iteratorIndex++];
            }
        };
        //Usage of custom iterator declared in separate class
        //return new MyCustomIterator<>(this);
    }
}
