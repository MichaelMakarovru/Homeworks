package module7_java_advanced_features.lesson4.input_output.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {

    public static void main(String[] args) {

        File source = new File
                ("src/module7_java_advanced_features/lesson4/input_output/files/person");

        Person person = new Person("John", 45, "Male");
        Person.count = 25;
        System.out.println(Person.count);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(source))) {

            outputStream.writeObject(person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
