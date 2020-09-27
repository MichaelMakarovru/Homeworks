package module2_java_fundamentals.lesson3.arrays;

public class StringsExample {

    public static void main(String[] args) {

        String string = "Java";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            stringBuilder.append(charArray[i]);
        }
        System.out.println(stringBuilder.toString());

        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(charArray);
        System.out.println(stringBuilder1.toString());
        System.out.println();

        string = "Java is a programming language";
        String[] stringArray = string.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder2.append(stringArray[i]);
            stringBuilder2.append(" ");
        }
        System.out.println(stringBuilder2.toString());
    }
}
