package module7_java_advanced_features.lesson3.comparable_comparator;

//Class must implement Comparable if you want to use it in TreeSet and TreeMap
//or be able to sort it
class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.getName()) != 0) {
            return this.name.compareTo(o.getName());
        }
        return this.age - o.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
