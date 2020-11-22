package module7_java_advanced_features.lesson4.input_output;

import java.io.File;

class FileExample {

    public static void main(String[] args) {

        //Class File represents file or directory
        File file = new File
                ("src/module7_java_advanced_features/lesson4/input_output/files/test.txt");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length()); //in bytes
        System.out.println(file.lastModified());
        System.out.println("Parent: " + file.getParent());

        File file4 = new File("src/module7_java_advanced_features/lesson4/input_output/files");
        File[] files = file4.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }

//        File file1 = new File("src/module7_java_advanced_features/lesson4/input_output/files/test2.txt");
//        System.out.println(file.renameTo(file1));
//        System.out.println(file.delete());

//        File file2 = new File("src/module7_java_advanced_features/lesson4/input_output/files/test_folder");
//        file2.mkdir();

//          File file3 = new File("src/module7_java_advanced_features/lesson4/input_output/files/test_folder/inner");
//          file2.mkdirs();
    }
}
