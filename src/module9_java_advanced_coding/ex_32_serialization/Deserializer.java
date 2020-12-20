package module9_java_advanced_coding.ex_32_serialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Deserializer {

    public List<Person> deserialize(File file) {

        List<Person> people = new ArrayList<>();

        try (ObjectInputStream inputStream =
                     new ObjectInputStream(new FileInputStream(file))) {

//            while (true) {
//                try {
//                    Object object = inputStream.readObject();
//                    people.add((Person) object);
//                } catch (EOFException e) {
//                    break;
//                }
//            }

            Object object = inputStream.readObject();
            return (List<Person>) object;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return people;
    }
}
