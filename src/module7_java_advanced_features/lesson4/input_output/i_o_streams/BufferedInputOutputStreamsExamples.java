package module7_java_advanced_features.lesson4.input_output.i_o_streams;

import java.io.*;

class BufferedInputOutputStreamsExamples {

    public static void main(String[] args) {

        File source = new File
       ("src/module7_java_advanced_features/lesson4/input_output/files/test.txt");
        File destination = new File
       ("src/module7_java_advanced_features/lesson4/input_output/files/copy.txt");

        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(source));
             OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destination))) {

           byte[] buffer = new byte[40];
           int length;
           while ((length = inputStream.read(buffer)) > 0) {
               outputStream.write(buffer, 0, length);
               outputStream.flush();
           }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
