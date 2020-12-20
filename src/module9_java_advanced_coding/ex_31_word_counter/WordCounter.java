package module9_java_advanced_coding.ex_31_word_counter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class WordCounter {

    Path path2 = Paths.get("src\\module9_java_advanced_coding\\ex_30_file_reader_writer\\files\\words.txt");

    public void countWords(Path path) {

        try (BufferedReader reader = Files.newBufferedReader(path);
             BufferedWriter writer = Files.newBufferedWriter(path2)) {

            StringBuilder stringBuilder = new StringBuilder();

            String s;
            while ((s = reader.readLine()) != null) {
                stringBuilder.append(s.toUpperCase()).append(" ");
            }

            List<String> stringList =
                    new ArrayList<>(Arrays.asList(stringBuilder.toString()
                            .replaceAll(",", "")
                            .replaceAll("\\.", "")
                            .split(" ")));

            Map<String, Integer> map = new HashMap<>();

            for (String s1 : stringList) {
                if (map.containsKey(s1)) {
                    map.put(s1, map.get(s1) + 1);
                } else {
                    map.put(s1, 1);
                }
            }

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                writer.write(entry.getKey() + " - " + entry.getValue());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
