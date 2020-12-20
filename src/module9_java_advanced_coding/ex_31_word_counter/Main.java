package module9_java_advanced_coding.ex_31_word_counter;

import java.nio.file.Path;
import java.nio.file.Paths;

class Main {

    public static void main(String[] args) {

        WordCounter wordCounter = new WordCounter();
        Path path = Paths.get("src\\module9_java_advanced_coding\\ex_30_file_reader_writer\\files\\test.txt");
        wordCounter.countWords(path);
    }
}
