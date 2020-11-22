package module7_java_advanced_features.lesson4.reflection;

class Cat {

    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " runs");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
