package module2_java_fundamentals.lesson1;

public class StringMethods {

    public static void main(String[] args) {

        String java = "Java";
        System.out.println(java.length());
        char j = java.charAt(0);
        System.out.println(j);
        System.out.println(java.charAt(1));
        System.out.println(java.charAt(2));
        System.out.println(java.charAt(3));
        System.out.println();
        int indexOfJ = java.indexOf('J');
        int indexOfA = java.indexOf('a');
        System.out.println("Index of J in Java " + indexOfJ);
        System.out.println("Index of a in Java " + indexOfA);
        System.out.println("Index of j in Java " + java.indexOf('j'));
        System.out.println("Index of A in Java " + java.indexOf('A'));
        System.out.println("Index of w in Java " + java.indexOf('w'));
        System.out.println();
        System.out.println("Substring 2..4 of Java = " + java.substring(2, 4));
        System.out.println("Substring 0..4 of Java = " + java.substring(0, 4));

        String javaIsAProgrammingLanguage = "Java is a programming language.";
        System.out.println("Substring 0..4 = " + javaIsAProgrammingLanguage.substring(0, 4));

        System.out.println();
        System.out.println(java);
        java = java.toUpperCase();
        System.out.println(java);
        java = java.toLowerCase();
        System.out.println(java);
        System.out.println();

        String s = "Java";
        String s1 = "JavA";
        System.out.println("Java and JavA equals = " + s.equals(s1));
        System.out.println("JAVA and JAVA equals = " + s.toUpperCase().equals(s1.toUpperCase()));

        //Both values did not change because we did not save results of toUpperCase() methods
        System.out.println(s);
        System.out.println(s1);

        System.out.println("Java and JavA equals ignoring case = " + s.equalsIgnoreCase(s1));

        boolean starts = s.startsWith("Ja");
        System.out.println("Java starts with Ja = " + starts);
        starts = s.startsWith("ABC");
        System.out.println("Java starts with ABC = " + starts);

        boolean ends = s.endsWith("va");
        System.out.println("Java ends with va = " + ends);
        ends = s.endsWith("abc");
        System.out.println("Java ends with abc = " + ends);
        System.out.println();
        System.out.println(javaIsAProgrammingLanguage);
        boolean contains = javaIsAProgrammingLanguage.contains("programming");
        System.out.println("String contains word programming = " + contains);
        contains = javaIsAProgrammingLanguage.contains("cat");
        System.out.println("String contains word cat = " + contains);
        System.out.println();
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace("Java", "PHP");
        System.out.println(javaIsAProgrammingLanguage);
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace("cat", "dog");
        System.out.println(javaIsAProgrammingLanguage);
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace("PHP", "Java");
        System.out.println(javaIsAProgrammingLanguage);
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace('J', 'j');
        System.out.println(javaIsAProgrammingLanguage);
        javaIsAProgrammingLanguage = javaIsAProgrammingLanguage.replace('a', 'A');
        System.out.println(javaIsAProgrammingLanguage);

        String php = "PHP is a programming language";
        System.out.println(php.substring(4));
        System.out.println(php.substring(0, 3));
        php = php + " PHP ";
        System.out.println(php);
        System.out.println(php.replace("PHP ", ""));
        System.out.println(php.replaceFirst("PHP ", ""));
        System.out.println(php.replaceAll("PHP ", ""));

        System.out.println();
        String spaces = "  Java   ";
        System.out.println(spaces);
        spaces = spaces.trim();
        System.out.println(spaces);

    }
}
