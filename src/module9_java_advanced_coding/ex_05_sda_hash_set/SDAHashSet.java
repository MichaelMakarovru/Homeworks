package module9_java_advanced_coding.ex_05_sda_hash_set;

import java.util.Arrays;

class SDAHashSet<E> {

    Object[] array = new Object[2];
    int index = 0;

    public void add(E e) {

        for (int i = 0; i < index; i++) {
            E current = (E) array[i];
            if (e.equals(current)) {
                return;
            }
        }

        if (index >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }

        array[index++] = e;
    }

    public void remove(E e) {

        int indexOfRemoved = -1;

        for (int i = 0; i < index; i++) {
            E current = (E) array[i];
            if (e.equals(current)) {
                array[i] = null;
                indexOfRemoved = i;
                break;
            }
        }

        for (int i = indexOfRemoved; i < index; i++) {
            array[i] = array[i + 1];
        }
        index--;
    }

    public int size() {
        return index;
    }

    public boolean contains(E e) {

        for (int i = 0; i < index; i++) {
            E current = (E) array[i];
            if (current.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        array = new Object[2];
        index = 0;
    }

    public void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(array[i]);
        }
    }
}
