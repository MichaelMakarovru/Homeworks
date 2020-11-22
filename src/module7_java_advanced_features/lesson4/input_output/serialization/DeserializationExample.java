package module7_java_advanced_features.lesson4.input_output.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {

    public static void main(String[] args) {

        File source = new File
       ("src/module7_java_advanced_features/lesson4/input_output/files/person");

        Person person = null;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(source))) {

            Object object = inputStream.readObject();
            person = (Person) object;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(person);
        System.out.println(Person.count);
    }
}
