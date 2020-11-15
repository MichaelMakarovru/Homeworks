package module7_java_advanced_features.lesson2.generics;

//Class can implement generic interface
//We can use Cat and it's children as T and Dog and it's children as K
class GenericClass<T extends Cat, K extends Dog> implements GenericInterface<T, K> {

    @Override
    public void print(T t, K k) {
        t.climb();
        k.sleep();
    }
}
