package module7_java_advanced_features.lesson4.functional_programming.functional_interfaces;

@FunctionalInterface
interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}
