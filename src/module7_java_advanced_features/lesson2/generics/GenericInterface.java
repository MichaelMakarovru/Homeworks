package module7_java_advanced_features.lesson2.generics;

//Interfaces can be generic
public interface GenericInterface<T, K> {

    void print(T t, K k);
}
