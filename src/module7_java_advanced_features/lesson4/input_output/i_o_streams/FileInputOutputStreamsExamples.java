package module7_java_advanced_features.lesson4.input_output.i_o_streams;

import java.io.*;

class FileInputOutputStreamsExamples {

    public static void main(String[] args) {

        File source = new File
       ("src/module7_java_advanced_features/lesson4/input_output/files/test.txt");
        File destination = new File
       ("src/module7_java_advanced_features/lesson4/input_output/files/copy.txt");

        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
           inputStream = new FileInputStream(source);
           outputStream = new FileOutputStream(destination);

           int b;
           while ((b = inputStream.read()) != -1) {
               outputStream.write(b);
           }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
