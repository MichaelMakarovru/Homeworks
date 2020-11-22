package module7_java_advanced_features.lesson4.nio_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

class PathExample {

    public static void main(String[] args) throws URISyntaxException, IOException {

        //Path replaces File class in NIO.2. It represents file, directory or link

        //Path creation
        Path path = Paths.get("src/module7_java_advanced_features/lesson4/input_output/files/test.txt");
        Path pathUri = Paths.get(new URI("file://C:/Coding/Projects/JavaRigaRus2/src/module7_java_advanced_features/lesson4/input_output/files/test.txt"));
        File file = new File
                ("src/module7_java_advanced_features/lesson4/input_output/files/test.txt");
        Path pathFromFile = file.toPath();

        System.out.println(path.toString());
        System.out.println(path.getNameCount());
        System.out.println(path.getName(3));
        System.out.println(path.getFileName());
        System.out.println(path.getParent());
        System.out.println("Absolute: " + path.isAbsolute());
        System.out.println("Absolute: " + path.toAbsolutePath());
        System.out.println("SubPath 0..3: " + path.subpath(0, 3));

        Path path2 = Paths.get("src/module7_java_advanced_features/lesson4/input_output/files/copy.txt");
        Files.copy(path, path2, REPLACE_EXISTING);
//        Path pathDir = Paths.get("src/module7_java_advanced_features/lesson4/input_output/files/dir");
//        Files.createDirectory(pathDir);
        System.out.println("Path exists: " + Files.exists(path2));
        Path path3 = Paths.get("src/module7_java_advanced_features/lesson4/input_output/files/copy2.txt");
        Files.move(path2, path3, REPLACE_EXISTING);
        System.out.println("Path exists: " + Files.exists(path2));
        System.out.println("Path exists: " + Files.exists(path3));
        Files.delete(path3);
        System.out.println("Path exists: " + Files.exists(path3));

        //New streams are added that accept Path object as a parameter
        try(BufferedReader reader = Files.newBufferedReader(path);
            BufferedWriter writer = Files.newBufferedWriter(path2)) {

            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(s.toUpperCase());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
