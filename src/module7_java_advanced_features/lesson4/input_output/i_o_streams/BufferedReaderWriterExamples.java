package module7_java_advanced_features.lesson4.input_output.i_o_streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderWriterExamples {

    public static void main(String[] args) {

        File source = new File
                ("src/module7_java_advanced_features/lesson4/input_output/files/test.txt");
        File destination = new File
                ("src/module7_java_advanced_features/lesson4/input_output/files/copy.txt");

        List<String> fileData = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {

            String s;
            while ((s = reader.readLine()) != null) {
                fileData.add(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        for (String s : fileData) {
            System.out.println(s);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {

            for (String s : fileData) {
                writer.write(s.toUpperCase());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
