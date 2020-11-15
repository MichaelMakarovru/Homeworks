package module7_java_advanced_features.lesson2.generics;

class Cat extends Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void climb() {
        System.out.println(name + " climbs a tree.");
    }
}
