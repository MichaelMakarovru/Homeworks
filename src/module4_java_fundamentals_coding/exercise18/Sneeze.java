package module4_java_fundamentals_coding.exercise18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Sneeze {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a text: ");
        String achoo = scanner.next();

        Pattern pattern = Pattern.compile("[Aa][Cc][Hh][Oo]+");

        Matcher matcher = pattern.matcher(achoo);
        System.out.println("User sneezed: " + matcher.matches());
    }
}
