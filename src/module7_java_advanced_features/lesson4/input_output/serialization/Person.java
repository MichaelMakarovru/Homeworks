package module7_java_advanced_features.lesson4.input_output.serialization;

import java.io.Serializable;

//Class must implement Serializable interface in order to be serializable
public class Person implements Serializable {

    //Static variables are not serialized
    public static int count = 0;

    private String name;
    private int age;
    //Transient variables are not serialized
    private transient String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
