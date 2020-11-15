package module7_java_advanced_features.lesson2.generics;

//We can create generic class to use it with various data types
class Box<T> {

    private T contents;

    public T emptyBox() {
       T contents = this.contents;
       this.contents = null;
       return contents;
    }

    public void putInABox(T contents) {
        this.contents = contents;
    }
}
