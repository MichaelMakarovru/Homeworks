package module2_java_fundamentals.lesson4.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {

    public static void main(String[] args) {

        /*
            a - symbol a
            b - symbol b
            ...
            \t - tab
            \n - new line
            \r - return

            . - any symbol
            [abc] - a | b | c
            [^abc] - any symbol except abc
            [a-z] - symbol range a..z
            \\s - space
            \\d - digit
            \\D - not digit
            \\w - word symbol a-z, A-Z, _ , 0-9

            ^ - start of the line
            $ - end of the string

            x? - x one or zero times
            x* - x zero or more times
            x+ - x one or more times
            x{n} - x occurs n times
            x{n,} - x occurs n times or more
            x{n,m} - x occurs n times or more util m times
         */

        //input string
        String s = "Jav2a is4 a p3rog5ram5min9g language$";
        System.out.println(s);
        //remove all digits
        String noDigits = s.replaceAll("\\d", "");
        System.out.println(noDigits);
        //remove all non digit characters
        String onlyDigits = s.replaceAll("\\D", "");
        System.out.println(onlyDigits);
        //remove all spaces
        String noSpaces = s.replaceAll("\\s", "");
        System.out.println(noSpaces);
        //remove all word characters
        String noWordSymbols = s.replaceAll("\\w", "");
        System.out.println(noWordSymbols);
        //remove all characters except a, p, l
        String apl = s.replaceAll("[^apl]", "");
        System.out.println(apl);
        //remove all a, p and l occurrences
        String noApl = s.replaceAll("[apl]", "");
        System.out.println(noApl);
        //remove all characters starting from a to k
        String range = s.replaceAll("[a-k]", "");
        System.out.println(range);
        //remove all characters
        String any = s.replaceAll(".", "");
        System.out.println(any);
        System.out.println();

        //using tabulation symbol
        String random = "\tHello";
        System.out.println(random);
        //add new line symbol to string
        System.out.print(random + "\n");
        System.out.println("Hello");
        System.out.println(random.replaceAll("\t", ""));
        System.out.println();
        random = "With new line regex\n";
        System.out.print(random);
        System.out.print(random);
        random = random.replaceAll("\n", "");
        System.out.print(random);
        System.out.print(random);
        System.out.println();
        System.out.println();

        //regex to validate eMail address.
        String regex = "\\w+@\\D+\\.\\D{2,3}";
        //Passing regex to pattern object
        Pattern pattern = Pattern.compile(regex);

        //checking emails with matcher
        String eMail = "john@gmail.com";
        Matcher matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "john@mail.ru";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "john@mail.r";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "john@mail.root";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "@gmail.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "j@gmail.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "johngmail.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "john@.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "john@s.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "123@s.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "1_23@s.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());

        eMail = "1_23@12.com";
        matcher = pattern.matcher(eMail);
        System.out.println(eMail + " : " + matcher.matches());
        System.out.println();

        //Regex: string begins with a, then any one character
        regex = "^a.";
        pattern = Pattern.compile(regex);

        String a = "ab";
        matcher = pattern.matcher(a);
        System.out.println(a + " : " + matcher.matches());

        a = "ba";
        matcher = pattern.matcher(a);
        System.out.println(a + " : " + matcher.matches());
        //any characters (one or more) ending with bab
        regex = ".+bab$";
        pattern = Pattern.compile(regex);

        a = "aabab";
        matcher = pattern.matcher(a);
        System.out.println(a + " : " + matcher.matches());

        a = "aababa";
        matcher = pattern.matcher(a);
        System.out.println(a + " : " + matcher.matches());
    }
}
