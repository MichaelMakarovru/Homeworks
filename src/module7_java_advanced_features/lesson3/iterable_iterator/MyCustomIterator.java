package module7_java_advanced_features.lesson3.iterable_iterator;

import java.util.Iterator;

class MyCustomIterator<E> implements Iterator<E> {

    private MyCustomCollection<E> collection;
    int iteratorIndex = 0;

    public MyCustomIterator(MyCustomCollection<E> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return collection.array[iteratorIndex] != null;
    }

    @Override
    public E next() {
        return (E) collection.array[iteratorIndex++];
    }
}
