package module9_java_advanced_coding.ex_32_serialization;

import java.io.File;
import java.util.List;

class Main {

    public static void main(String[] args) {
        File source = new File
                ("src\\module9_java_advanced_coding\\ex_30_file_reader_writer\\files\\persons");

//        Person john = new Person("John", 35);
//        Person ann = new Person("Ann", 30);
//        Person maria = new Person("Maria", 25);
//
//        List<Person> list = Arrays.asList(john, ann, maria);
//
//        Serializer serializer = new Serializer();
//        serializer.serialize(source, list);

        Deserializer deserializer = new Deserializer();
        List<Person> people = deserializer.deserialize(source);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
