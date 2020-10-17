package module2_java_fundamentals.lesson2.object;

import java.util.Objects;

class Person {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Person person) {
        if (this == person) return true;
        if (person == null) return false;
        if (this.age != person.age) return false;
        return Objects.equals(name, person.name);
    }

    public String toString() {
        return "Person: name = " + name;
    }
}
