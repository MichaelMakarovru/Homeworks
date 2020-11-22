package module7_java_advanced_features.lesson4.nio_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

class NioStreams {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/module7_java_advanced_features/lesson4/input_output/files/");

        Files.walk(path)
                .filter(p -> p.toString().endsWith(".txt"))
                .forEach(p -> System.out.println(p));
        System.out.println();

        Path path2 = Paths.get("src/");
        BiPredicate<Path, BasicFileAttributes> predicate = (p, b) -> p.toString().endsWith("test.txt") && b.isRegularFile();
        Files.find(path2, 5, predicate)
            .forEach(p -> System.out.println(p));
        System.out.println();

        Files.list(path)
                .filter(p -> !Files.isDirectory(p))
                .forEach(p -> System.out.println(p));
        System.out.println();

        Path pathFile = Paths.get("src/module7_java_advanced_features/lesson4/input_output/files/test.txt");
        List<String> list = Files
                .lines(pathFile)
                .collect(Collectors.toList());

        for (String s : list) {
            System.out.println(s);
        }

    }
}
