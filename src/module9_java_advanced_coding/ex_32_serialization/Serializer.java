package module9_java_advanced_coding.ex_32_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

class Serializer {

    public void serialize(File file, List<Person> list) {

        try (ObjectOutputStream outputStream =
                     new ObjectOutputStream(new FileOutputStream(file))) {

//            for (Person person : list) {
//                outputStream.writeObject(person);
//            }

            outputStream.writeObject(list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
