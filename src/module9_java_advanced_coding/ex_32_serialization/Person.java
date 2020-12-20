package module9_java_advanced_coding.ex_32_serialization;

import java.io.Serializable;

//Class must implement Serializable interface in order to be serializable
class Person implements Serializable {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
