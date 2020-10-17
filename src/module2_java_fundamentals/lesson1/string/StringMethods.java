package module2_java_fundamentals.lesson1.string;

public class StringMethods {

    public static void main(String[] args) {

        String java = "Java";
        System.out.println(java);
        //length() returns a length of a string
        System.out.println("Length of Java = " + java.length());
        System.out.println();

        //charAt() returns a char positioned at the defined index
        //First index is 0
        char j = java.charAt(0);
        System.out.println("Char at index 0 in Java = " + j);
        System.out.println("Char at index 1 in Java = " +java.charAt(1));
        System.out.println("Char at index 2 in Java = " +java.charAt(2));
        System.out.println("Char at index 3 in Java = " +java.charAt(3));
        System.out.println();

        //indexOf returns index of a first occurred character in string.
        //-1 if no character found
        int indexOfJ = java.indexOf('J');
        int indexOfA = java.indexOf('a');
        System.out.println("Index of J in Java " + indexOfJ);
        System.out.println("Index of a in Java " + indexOfA);
        System.out.println("Index of j in Java " + java.indexOf('j'));
        System.out.println("Index of A in Java " + java.indexOf('A'));
        System.out.println("Index of w in Java " + java.indexOf('w'));
        System.out.println();

        //Substring is used to get a substring of another string
        System.out.println("Substring 2..4 of Java = " + java.substring(2, 4));
        System.out.println("Substring 0..4 of Java = " + java.substring(0, 4));

        String javaIsAProgrammingLanguage = "Java is a programming language.";
        System.out.println(javaIsAProgrammingLanguage);
        System.out.println("Substring 0..4 = " + javaIsAProgrammingLanguage.substring(0, 4));
        System.out.println();

        //toUpperCase() and toLowerCase()
        System.out.println(java);
        java = java.toUpperCase();
        System.out.println("After toUpperCase() = " + java);
        java = java.toLowerCase();
        System.out.println("After toLowerCase() = " + java);
        System.out.println();

        //Ways to compare strings
        String s = "Java";
        String s1 = "JavA";
        System.out.println("Java and JavA equals = " + s.equals(s1));
        System.out.println("JAVA and JAVA equals = " + s.toUpperCase().equals(s1.toUpperCase()));
        //Both values did not change because we did not save the results of toUpperCase() methods
        System.out.println(s);
        System.out.println(s1);

        System.out.println("Java and JavA equals ignoring case = " + s.equalsIgnoreCase(s1));
        System.out.println();

        //Check if string starts with a substring
        boolean starts = s.startsWith("Ja");
        System.out.println("Java starts with Ja = " + starts);
        starts = s.startsWith("ABC");
        System.out.println("Java starts with ABC = " + starts);

        //Check if string ends with a substring
        boolean ends = s.endsWith("va");
        System.out.println("Java ends with va = " + ends);
        ends = s.endsWith("abc");
        System.out.println("Java ends with abc = " + ends);
        System.out.println();

        //Check if string contains a substring
        System.out.println(javaIsAProgrammingLanguage);
        boolean contains = javaIsAProgrammingLanguage.contains("programming");
        System.out.println("String contains word programming = " + contains);
        contains = javaIsAProgrammingLanguage.contains("cat");
        System.out.println("String contains word cat = " + contains);
        System.out.println();

        System.out.println(javaIsAProgrammingLanguage);
        //Replace all Java occurrences with PHP
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace("Java", "PHP");
        System.out.println(javaIsAProgrammingLanguage);
        //Replace all cat occurrences with dog
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace("cat", "dog");
        System.out.println(javaIsAProgrammingLanguage);
        //Replace all PHP occurrences with Java
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace("PHP", "Java");
        System.out.println(javaIsAProgrammingLanguage);
        //Replace all J occurrences with j
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace('J', 'j');
        System.out.println(javaIsAProgrammingLanguage);
        //Replace all a occurrences with A
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace('a', 'A');
        System.out.println(javaIsAProgrammingLanguage);
        System.out.println();

        String php = "PHP is a programming language";
        System.out.println(php);
        //get a substring starting with index 4
        System.out.println(php.substring(4));
        //get a substring starting with index 0, ending before index 3
        System.out.println(php.substring(0, 3));
        //concatenate
        php = php + " PHP ";
        System.out.println(php);
        //remove all PHP occurrences
        System.out.println(php.replace("PHP ", ""));
        //remove only first PHP occurrence
        System.out.println(php.replaceFirst("PHP ", ""));
        //Remove all digits. replaceAll accepts regex as parameter
        System.out.println("123Java456");
        System.out.println("123Java456".replaceAll("\\d", ""));
        System.out.println();

        //trim() removes all spaces in the beginning and in the end
        String spaces = "  Java   ";
        System.out.println(spaces);
        spaces = spaces.trim();
        System.out.println(spaces);
    }
}
