package module9_java_advanced_coding.ex_33_walk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class Main {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src\\");

        Files.walk(path)
                .filter(p -> p.toString().endsWith(".png"))
                .forEach(p -> System.out.println(p));
        System.out.println();
    }
}
