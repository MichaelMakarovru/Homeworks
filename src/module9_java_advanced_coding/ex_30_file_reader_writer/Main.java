package module9_java_advanced_coding.ex_30_file_reader_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {

        Path path = Paths.get("src\\module9_java_advanced_coding\\ex_30_file_reader_writer\\files\\test.txt");
        String oldName = path.getFileName().toString();
        String name = oldName.split("\\.")[0];
        String postfix = oldName.split("\\.")[1];
        StringBuilder sb = new StringBuilder(name).reverse();
        String newName = sb.toString() + "." + postfix;
        Path path2 = Paths.get("src\\module9_java_advanced_coding\\ex_30_file_reader_writer\\files\\" + newName);

        try(BufferedReader reader = Files.newBufferedReader(path);
            BufferedWriter writer = Files.newBufferedWriter(path2)) {

            List<StringBuilder> list = new ArrayList<>();

            String s;
            while ((s = reader.readLine()) != null) {
               list.add(new StringBuilder().append(s).reverse());
            }

            for (int i = list.size() - 1; i >= 0 ; i--) {
                writer.write(list.get(i).toString());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
