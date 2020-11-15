package module7_java_advanced_features.lesson2.generics;

class Dog extends Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        System.out.println(name + " sleep");
    }
}
